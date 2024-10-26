//package dao;
//
//import connectDB.ConnectDB;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class LoaiBan_DAO {
//
//    // Thêm loại bàn
//    public boolean addLoaiBan(LoaiBan loaiBan) {
//        String sql = "INSERT INTO loai_ban (maLoai, tenLoai) VALUES (?, ?)";
//        Connection con = null;
//        PreparedStatement statement = null;
//
//        try {
//            ConnectDB.getInstance().connect(); // Establish the connection
//            con = ConnectDB.getConnection();
//            statement = con.prepareStatement(sql);
//            
//            statement.setString(1, loaiBan.getMaLoai());
//            statement.setString(2, loaiBan.getTenLoai());
//            
//            int rowsInserted = statement.executeUpdate();
//            return rowsInserted > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(statement, con);  // Ensure resources are closed
//        }
//        return false;
//    }
//
//    // Cập nhật loại bàn
//    public boolean updateLoaiBan(LoaiBan loaiBan) {
//        String sql = "UPDATE loai_ban SET tenLoai = ? WHERE maLoai = ?";
//        Connection con = null;
//        PreparedStatement statement = null;
//
//        try {
//            ConnectDB.getInstance().connect(); // Establish the connection
//            con = ConnectDB.getConnection();
//            statement = con.prepareStatement(sql);
//            
//            statement.setString(1, loaiBan.getTenLoai());
//            statement.setString(2, loaiBan.getMaLoai());
//            
//            int rowsUpdated = statement.executeUpdate();
//            return rowsUpdated > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(statement, con);  // Ensure resources are closed
//        }
//        return false;
//    }
//
//    // Xóa loại bàn
//    public boolean deleteLoaiBan(String maLoai) {
//        String sql = "DELETE FROM loai_ban WHERE maLoai = ?";
//        Connection con = null;
//        PreparedStatement statement = null;
//
//        try {
//            ConnectDB.getInstance().connect(); // Establish the connection
//            con = ConnectDB.getConnection();
//            statement = con.prepareStatement(sql);
//            
//            statement.setString(1, maLoai);
//            
//            int rowsDeleted = statement.executeUpdate();
//            return rowsDeleted > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(statement, con);  // Ensure resources are closed
//        }
//        return false;
//    }
//
//    // Lấy tất cả loại bàn
//    public List<LoaiBan> getAllLoaiBan() {
//        List<LoaiBan> loaiBanList = new ArrayList<>();
//        String sql = "SELECT * FROM loai_ban";
//        Connection con = null;
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            ConnectDB.getInstance().connect(); // Establish the connection
//            con = ConnectDB.getConnection();
//            statement = con.prepareStatement(sql);
//            resultSet = statement.executeQuery();
//            
//            while (resultSet.next()) {
//                String maLoai = resultSet.getString("maLoai");
//                String tenLoai = resultSet.getString("tenLoai");
//                
//                LoaiBan loaiBan = new LoaiBan(maLoai, tenLoai);
//                loaiBanList.add(loaiBan);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(resultSet, statement, con);  // Ensure resources are closed
//        }
//        return loaiBanList;
//    }
//
//    // Lấy loại bàn theo mã
//    public LoaiBan getLoaiBanById(String maLoai) {
//        String sql = "SELECT * FROM loai_ban WHERE maLoai = ?";
//        Connection con = null;
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//
//        try {
//            ConnectDB.getInstance().connect(); // Establish the connection
//            con = ConnectDB.getConnection();
//            statement = con.prepareStatement(sql);
//            
//            statement.setString(1, maLoai);
//            resultSet = statement.executeQuery();
//            
//            if (resultSet.next()) {
//                String tenLoai = resultSet.getString("tenLoai");
//                return new LoaiBan(maLoai, tenLoai);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            closeResources(resultSet, statement, con);  // Ensure resources are closed
//        }
//        return null;
//    }
//
//    // Helper method to close resources
//    private void closeResources(ResultSet rs, PreparedStatement ps, Connection conn) {
//        try {
//            if (rs != null) rs.close();
//            if (ps != null) ps.close();
//            if (conn != null) conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private void closeResources(PreparedStatement ps, Connection conn) {
//        closeResources(null, ps, conn);
//    }
//}
