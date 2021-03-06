package View;
/**
 * @author Gerhard Kloppers
 * @vesrion 1.15.0 8/6/2020
 * @see java.lang.System
 **/
import Model.Books;
import Model.Products;
import Model.DigitalItems;
import javax.swing.JOptionPane;

public class CheckoutScreen extends javax.swing.JFrame {
/**
 * The CheckoutScreen is used to get the selected item from the MainScreen, and display the info for checkout.
 * 
 * @param args (parameters is data that is selected and passed trough to the CheckoutScreen. 
 * @returns selected data as String.
 * 
**/

    Products OrderedProduct;
    Books OrderedBooks;
    DigitalItems OrderedDigitalItems;

    public CheckoutScreen(Products p, DigitalItems d, Books b) {
        initComponents();
        if (p != null) {
            this.OrderedProduct = p;
            this.CheckoutTextArea.setLineWrap(true);
            this.CheckoutTextArea.setText("Product ID: " + p.getProductID() + "\n" + "Product name: " + p.getProductName() + "\n" + "Product price: R" + p.getProductPrice() + "\n" + "Product description: " + p.getProductDescription() + "\n" + "____________________________" + "\n");
            this.CheckoutTextArea.setEditable(false);
        }
        if (b != null) {
            this.OrderedBooks = b;
            this.CheckoutTextArea.setLineWrap(true);
            this.CheckoutTextArea.setText("Book ID: " + b.getBookID() + "\n" + "Book name: " + b.getBookName() + "\n" + "Book price: R" + b.getBookPrice() + "\n" + "Book description: " + b.getBookDiscription() + "\n" + "____________________________" + "\n");
            this.CheckoutTextArea.setEditable(false);
        }
        if (d != null) {
            this.OrderedDigitalItems = d;
            this.CheckoutTextArea.setLineWrap(true);
            this.CheckoutTextArea.setText("Digital Item ID: " + d.getDigitalItemID() + "\n" + "Digital Item name: " + d.getDigitalItemName() + "\n" + "Digital Item price: R" + d.getDigitalItemPrice() + "\n" + "Digital Item description: " + d.getDigitalItemDescription() + "\n" + "____________________________" + "\n");
            this.CheckoutTextArea.setEditable(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CheckoutTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        CheckoutConfirmCheckBox = new javax.swing.JCheckBox();
        CheckoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Checkout:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 370, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setLayout(null);

        CheckoutTextArea.setColumns(20);
        CheckoutTextArea.setRows(5);
        CheckoutTextArea.setToolTipText("Checkout product info.");
        jScrollPane1.setViewportView(CheckoutTextArea);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 10, 1030, 290);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.setLayout(null);

        CheckoutConfirmCheckBox.setBackground(new java.awt.Color(0, 153, 255));
        CheckoutConfirmCheckBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CheckoutConfirmCheckBox.setText("Confirm Checkout?");
        CheckoutConfirmCheckBox.setToolTipText("Checkout confirm.");
        jPanel3.add(CheckoutConfirmCheckBox);
        CheckoutConfirmCheckBox.setBounds(470, 10, 170, 24);

        CheckoutButton.setBackground(new java.awt.Color(0, 255, 255));
        CheckoutButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CheckoutButton.setForeground(new java.awt.Color(0, 51, 255));
        CheckoutButton.setText("Checkout");
        CheckoutButton.setToolTipText("Checkout button,");
        CheckoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckoutButtonMouseClicked(evt);
            }
        });
        jPanel3.add(CheckoutButton);
        CheckoutButton.setBounds(480, 50, 140, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckoutButtonMouseClicked
        if (this.CheckoutConfirmCheckBox.isSelected()) {
            DeliveryScreen scrn = new DeliveryScreen();
            scrn.setVisible(true);
            scrn.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "You have not confirmed checkout!");
        }

    }//GEN-LAST:event_CheckoutButtonMouseClicked

    public boolean formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        System.out.println("Window opened");
        return true;
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(CheckoutScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CheckoutScreen scr = new CheckoutScreen(null, null, null);
                scr.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckoutButton;
    private javax.swing.JCheckBox CheckoutConfirmCheckBox;
    private javax.swing.JTextArea CheckoutTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
