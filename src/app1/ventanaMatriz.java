package app1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//@author MarcoVilera

public class ventanaMatriz extends javax.swing.JFrame {

    /**
     * Creates new form ventanaMatriz
     */
    public ventanaMatriz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.m,.,.,.ñ:_:_:;:;:@
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nField = new javax.swing.JTextField();
        calcBtn = new javax.swing.JButton();
        clrBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatriz = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        displayTest1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mostrResult2 = new javax.swing.JLabel();
        mostrResult3 = new javax.swing.JLabel();
        mostrResult4 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        mostrResult5 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane3.setViewportView(jTextPane1);

        jScrollPane5.setViewportView(jTextPane3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Introduce valor n (1-9)");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));
        jPanel1.add(nField, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 28, 118, -1));

        calcBtn.setText("Calcular");
        calcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcBtnActionPerformed(evt);
            }
        });
        jPanel1.add(calcBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 28, -1, -1));

        clrBtn.setText("Limpiar");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });
        jPanel1.add(clrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 28, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("1:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 284, -1, -1));

        tblMatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMatriz);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 68, 870, 147));

        displayTest1.setEditable(false);
        displayTest1.setColumns(2);
        displayTest1.setRows(1);
        displayTest1.setFocusable(false);
        displayTest1.setEditable(false);
        jScrollPane4.setViewportView(displayTest1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 267, 850, 50));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("2: Multiplicación 1era columna");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 329, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("3: Resultado inverso de la multiplicación de 1era columna");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 351, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("4: Promedio suma diagonal secundaria");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 373, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("5: Potencia de menor elemento elevado al mayor elemento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 412, -1, -1));

        mostrResult2.setText(" ");
        jPanel1.add(mostrResult2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 329, -1, -1));

        mostrResult3.setText(" ");
        jPanel1.add(mostrResult3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        mostrResult4.setText(" ");
        jPanel1.add(mostrResult4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 373, -1, -1));

        mostrResult5.setEditable(false);
        mostrResult5.setColumns(2);
        mostrResult5.setRows(1);
        mostrResult5.setFocusable(false);
        displayTest1.setEditable(false);
        jScrollPane6.setViewportView(mostrResult5);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 490, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBtnActionPerformed
        // TODO add your handling code here:
        boolean fail = false;
        int n = 0;
        try {
            n = Integer.parseInt(nField.getText());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            fail = true;
        }
        try {
            if (n < 1 || n > 9) {
                throw new NumException();
            }
        } catch (NumException ex) {
            JOptionPane.showMessageDialog(null, "Ingresa un número entre 1 y 9");
            fail = true;
        }
        if (fail == false) {
            n = Integer.parseInt(nField.getText());
            int matriz[][] = Operaciones.genRandMatriz(n);
            int vector[] = Operaciones.vectorMatriz(matriz, n);
            this.shownMatriz(matriz, n);
            String concatenado = Operaciones.vectorMayorMenor(vector);
            displayTest1.setText(concatenado);
            mostrResult2.setText(Operaciones.multColumna(matriz));
            mostrResult3.setText(Operaciones.retornaInv(matriz));
            mostrResult4.setText(Operaciones.diagonalSecProm(matriz));
            mostrResult5.setText(Operaciones.potenciaMenorMayor(matriz));
        }
    }//GEN-LAST:event_calcBtnActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        // TODO add your handling code here:
        this.closeMatriz();
        displayTest1.setText("");
        mostrResult2.setText("");
        mostrResult3.setText("");
        mostrResult4.setText("");
        mostrResult5.setText("");
    }//GEN-LAST:event_clrBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMatriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ventanaMatriz().setVisible(true);
            }
        });
    }

    public void shownMatriz(int matriz[][], int n) {//Muestra la matriz en la interfaz gráfica
        DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
        model.setRowCount(n);
        model.setColumnCount(n);
        model.setNumRows(n); //agregar esta línea para asegurarse de que la tabla tenga la cantidad correcta de filas
        tblMatriz.getTableHeader().setUI(null);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tblMatriz.setValueAt(matriz[i][j], i, j);
            }
        }
        tblMatriz.setDefaultEditor(Object.class, null); //celdas no sean editables
    }

    public void closeMatriz() {//Cierra la matriz en la interfaz gráfica
        nField.setText(null);
        nField.requestFocus();
        DefaultTableModel model = (DefaultTableModel) tblMatriz.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcBtn;
    private javax.swing.JButton clrBtn;
    public static javax.swing.JTextArea displayTest1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel mostrResult2;
    private javax.swing.JLabel mostrResult3;
    private javax.swing.JLabel mostrResult4;
    public static javax.swing.JTextArea mostrResult5;
    private javax.swing.JTextField nField;
    private javax.swing.JTable tblMatriz;
    // End of variables declaration//GEN-END:variables
}
