
package gui;

import dao.NhanVien_DAO;

public class Login extends javax.swing.JFrame {

 
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DangNhap = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        P_DangNhap = new javax.swing.JPanel();
        L_DangNhap = new javax.swing.JLabel();
        L_TaiKhoan = new javax.swing.JLabel();
        T_TaiKhoan = new javax.swing.JTextField();
        L_MatKhau = new javax.swing.JLabel();
        Password_f = new javax.swing.JPasswordField();
        Btn_dangNhap = new javax.swing.JButton();
        L_toDangKy = new javax.swing.JLabel();
        Btn_DangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        DangNhap.setPreferredSize(new java.awt.Dimension(800, 500));
        DangNhap.setLayout(null);

        Logo.setBackground(new java.awt.Color(0, 102, 102));
        Logo.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Thai Restaurant");

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addContainerGap())
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel6)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        DangNhap.add(Logo);
        Logo.setBounds(0, 0, 410, 500);

        P_DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        P_DangNhap.setMinimumSize(new java.awt.Dimension(400, 500));

        L_DangNhap.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        L_DangNhap.setForeground(new java.awt.Color(0, 102, 102));
        L_DangNhap.setText("Đăng Nhập");

        L_TaiKhoan.setText("Tài Khoản");

        T_TaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_TaiKhoanActionPerformed(evt);
            }
        });

        L_MatKhau.setText("Mật Khẩu");

        Btn_dangNhap.setBackground(new java.awt.Color(0, 102, 102));
        Btn_dangNhap.setForeground(new java.awt.Color(255, 255, 255));
        Btn_dangNhap.setText("Đăng Nhập");
        Btn_dangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_dangNhapActionPerformed(evt);
            }
        });

        L_toDangKy.setText("Chưa có tài khoản ?");

        Btn_DangKy.setForeground(new java.awt.Color(255, 51, 51));
        Btn_DangKy.setText("Đăng Ký");
        Btn_DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_DangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_DangNhapLayout = new javax.swing.GroupLayout(P_DangNhap);
        P_DangNhap.setLayout(P_DangNhapLayout);
        P_DangNhapLayout.setHorizontalGroup(
            P_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DangNhapLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(P_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_dangNhap)
                    .addGroup(P_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(T_TaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                        .addComponent(L_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Password_f)
                        .addComponent(L_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_DangNhapLayout.createSequentialGroup()
                        .addComponent(L_toDangKy)
                        .addGap(33, 33, 33)
                        .addComponent(Btn_DangKy)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_DangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(L_DangNhap)
                .addGap(99, 99, 99))
        );
        P_DangNhapLayout.setVerticalGroup(
            P_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_DangNhapLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(L_DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(L_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password_f, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn_dangNhap)
                .addGap(56, 56, 56)
                .addGroup(P_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_toDangKy)
                    .addComponent(Btn_DangKy))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        DangNhap.add(P_DangNhap);
        P_DangNhap.setBounds(410, 0, 390, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T_TaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_TaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T_TaiKhoanActionPerformed

    private void Btn_dangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_dangNhapActionPerformed
    	String tenTK = T_TaiKhoan.getText();
        String matKhau = new String(Password_f.getPassword());

        NhanVien_DAO nhanVienDAO = new NhanVien_DAO();
        if (nhanVienDAO.login(tenTK, matKhau)) {
            // Nếu đăng nhập thành công, mở Menu
            ManHinhChinh mn = new ManHinhChinh();
            mn.setVisible(true);
            this.dispose(); // Đóng cửa sổ đăng nhập
        } else {
            // Nếu đăng nhập thất bại, hiển thị thông báo lỗi
            javax.swing.JOptionPane.showMessageDialog(this, "Tên tài khoản hoặc mật khẩu không đúng!", "Lỗi đăng nhập", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Btn_dangNhapActionPerformed

    private void Btn_DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_DangKyActionPerformed
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Btn_DangKyActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_DangKy;
    private javax.swing.JButton Btn_dangNhap;
    private javax.swing.JPanel DangNhap;
    private javax.swing.JLabel L_DangNhap;
    private javax.swing.JLabel L_MatKhau;
    private javax.swing.JLabel L_TaiKhoan;
    private javax.swing.JLabel L_toDangKy;
    private javax.swing.JPanel Logo;
    private javax.swing.JPanel P_DangNhap;
    private javax.swing.JPasswordField Password_f;
    private javax.swing.JTextField T_TaiKhoan;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
