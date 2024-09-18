/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.ijse.mvc.view;

import edu.ijse.mvc.controller.CustomerController;
import edu.ijse.mvc.controller.ItemController;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author bimsara
 */
public class OrdersPanel extends javax.swing.JPanel {
    
    private CustomerController customerController = new CustomerController();
    private ItemController itemController = new ItemController();

    /**
     * Creates new form OrdersPanel
     */
    public OrdersPanel() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblOrdersId = new javax.swing.JLabel();
        txtOrdersId = new javax.swing.JTextField();
        lblCustomerId = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        btnCustomerId = new javax.swing.JButton();
        lblCustomerDetail = new javax.swing.JLabel();
        lblItemCode = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        btnItemCode = new javax.swing.JButton();
        lblItemDetail = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        lblDiscount = new javax.swing.JLabel();
        btnPlaceOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        btnAddToCart1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");

        lblOrdersId.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblOrdersId.setText("Order ID");

        txtOrdersId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lblCustomerId.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblCustomerId.setText("Customer ID");

        txtCustomerId.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnCustomerId.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnCustomerId.setText("Search");
        btnCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerIdActionPerformed(evt);
            }
        });

        lblCustomerDetail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lblItemCode.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblItemCode.setText("Item Code");

        txtItemCode.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnItemCode.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnItemCode.setText("Search");
        btnItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemCodeActionPerformed(evt);
            }
        });

        lblItemDetail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lblQty.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblQty.setText("Qty");

        txtQty.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtDiscount.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        lblDiscount.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblDiscount.setText("Discount");

        btnPlaceOrder.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnPlaceOrder.setText("Place Order");

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCart);

        btnAddToCart1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btnAddToCart1.setText("Add to Cart");
        btnAddToCart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCustomerDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblItemDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOrdersId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrdersId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddToCart1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPlaceOrder)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrdersId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOrdersId, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCustomerDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblItemDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblItemCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblQty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddToCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerIdActionPerformed
        searchCustomer();
    }//GEN-LAST:event_btnCustomerIdActionPerformed

    private void btnItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemCodeActionPerformed
        searchItem();
    }//GEN-LAST:event_btnItemCodeActionPerformed

    private void btnAddToCart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCart1ActionPerformed
        addToCart();
    }//GEN-LAST:event_btnAddToCart1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart1;
    private javax.swing.JButton btnCustomerId;
    private javax.swing.JButton btnItemCode;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerDetail;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblItemCode;
    private javax.swing.JLabel lblItemDetail;
    private javax.swing.JLabel lblOrdersId;
    private javax.swing.JLabel lblQty;
    private javax.swing.JTable tblCart;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtOrdersId;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables

    public void searchCustomer() {
        String customerId = txtCustomerId.getText();
        try {
            CustomerDto customerDto = customerController.searchCustomer(customerId);
            if(customerDto != null) {
                lblCustomerDetail.setText(customerDto.getTitle()+". "+customerDto.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Customer not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void searchItem() {
        String itemCode = txtItemCode.getText();
        try {
            ItemDto itemDto = itemController.searchItem(itemCode);
            if(itemDto != null) {
                lblItemDetail.setText(itemDto.getDescription() + " | " + itemDto.getPackSize() + " | " + itemDto.getQoh() + " | " + itemDto.getUnitPrice());
            } else {
                JOptionPane.showMessageDialog(this, "Item not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    public void loadTable() {
        String[] columns = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
          
        };
        tblCart.setModel(dtm);
    }
    
    public void addToCart() {
        String[] columns = {txtItemCode.getText(),txtQty.getText(), txtDiscount.getText()};
        DefaultTableModel dtm = (DefaultTableModel)tblCart.getModel();
        dtm.addRow(columns);
        clearItem();
    }
    
    public void clearItem() {
        txtItemCode.setText("");
        txtQty.setText("");
        txtDiscount.setText("");
        lblItemDetail.setText("");
    }
}
