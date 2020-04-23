/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cad_prod;

import java.awt.Color;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Marcelo
 */
public class CadProd extends javax.swing.JFrame implements ListSelectionListener {
    
    private static SessionFactory factory;
    private static ServiceRegistry registry;

    /**
     * Creates new form CadProd
     */
    public CadProd() {
        initComponents();
        id.setVisible(true);
        confAlteracaoBtn.setVisible(false);
        altCancelBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Novo_SistemaPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Novo_SistemaPU").createEntityManager();
        produtos_1Query = java.beans.Beans.isDesignTime() ? null : Novo_SistemaPUEntityManager.createQuery("SELECT p FROM Produtos_1 p");
        produtos_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtos_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        consultaBtn = new javax.swing.JButton();
        alterarBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        relatorioBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodprod = new javax.swing.JTextField();
        txtDescprod = new javax.swing.JTextField();
        txtQtdprod = new javax.swing.JTextField();
        txtPrcvenprod = new javax.swing.JTextField();
        lblAlerta = new javax.swing.JLabel();
        confAlteracaoBtn = new javax.swing.JButton();
        altCancelBtn = new javax.swing.JButton();
        id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");

        consultaBtn.setText("Consultar");
        consultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBtnActionPerformed(evt);
            }
        });

        alterarBtn.setText("Alterar");
        alterarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Excluir");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirMouseClicked(evt);
            }
        });

        relatorioBtn.setText("Relatórios");
        relatorioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatorioBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Código do Produto:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("Descrição do Produto:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade em Estoque:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Preço de Venda:");

        txtPrcvenprod.setText("0");

        lblAlerta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        confAlteracaoBtn.setText("Confirmar");
        confAlteracaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confAlteracaoBtnActionPerformed(evt);
            }
        });

        altCancelBtn.setText("Cancelar");
        altCancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altCancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alterarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(relatorioBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodprod)
                            .addComponent(txtDescprod)
                            .addComponent(txtQtdprod)
                            .addComponent(txtPrcvenprod, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confAlteracaoBtn)
                    .addComponent(altCancelBtn))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3, jLabel4, jLabel5});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alterarBtn, btnIncluir, consultaBtn, deleteBtn});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {altCancelBtn, confAlteracaoBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDescprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4))
                            .addComponent(txtQtdprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrcvenprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(confAlteracaoBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(lblAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(consultaBtn)
                            .addComponent(alterarBtn)
                            .addComponent(btnIncluir)
                            .addComponent(deleteBtn)
                            .addComponent(relatorioBtn))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(altCancelBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        id.setText("id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(id)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMouseClicked
        String txtCodprodValue = txtCodprod.getText();
        String verificaCodigo = null;
        verificaCodigo = checaCodigo(txtCodprodValue);
        if (verificaCodigo == null) {
            String txtDescprodValue = txtDescprod.getText();
            String txtPrcvenprodValue = txtPrcvenprod.getText();
            BigDecimal novotxtPrcvenprodValue = new BigDecimal(txtPrcvenprodValue.replace(",", "."));
            String txtQtdprodValue = txtQtdprod.getText();
            if (txtCodprodValue.isEmpty() || txtDescprodValue.isEmpty()
                    || txtQtdprodValue.isEmpty() || novotxtPrcvenprodValue.compareTo(BigDecimal.ZERO) <= 0) {
                lblAlerta.setText("Favor inserir os dados corretamente em todos os campos ");
            } else {
                Session session = factory.openSession();
                Transaction tx = null;
                //Integer id_prod = 1;
                try {
                    tx = session.beginTransaction();
                    Produtos produto = new Produtos();
                    //anotation de auto increment não está funcionando
                    //apelando para consulta as chaves do banco    
                    String sql = "SELECT MAX(id) FROM PRODUTOS";
                    SQLQuery query = session.createSQLQuery(sql);
                    query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
                    List<HashMap> pk = query.list();
                    Integer newPk = (Integer) pk.get(0).get("max");
                    
                    produto.setId(newPk + 1);
                    produto.setCodProd(txtCodprodValue);
                    produto.setDescProd(txtDescprodValue);
                    produto.setQtdProd(Integer.parseInt(txtQtdprodValue));
                    produto.setPrecoProd(novotxtPrcvenprodValue);
                    session.save(produto);
                    tx.commit();
                    
                } catch (HibernateException e) {
                    if (tx != null) {
                        tx.rollback();
                    }
                    e.printStackTrace();
                } finally {
                    session.close();
                }
                lblAlerta.setText("Produto Incluido com Sucesso!");
                txtCodprod.setText("");
                txtDescprod.setText("");
                txtPrcvenprod.setText("");
                txtQtdprod.setText("");
            }
        } else {
            lblAlerta.setText("Codigo de produto já cadastrado!");
        }
    }//GEN-LAST:event_btnIncluirMouseClicked
    
    private void consultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBtnActionPerformed
        ListaProdutos lProd = new ListaProdutos();
        lProd.setResizable(false);
        //lProd.setSize(100, 100);
        //lProd.setUndecorated(true);
        //lProd.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        lProd.setVisible(true);
        //new ListaProdutos().setVisible(true);
        this.setVisible(false);
        this.dispose();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }//GEN-LAST:event_consultaBtnActionPerformed
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String txtCodprodValue = txtCodprod.getText();
        String txtDescprodValue = txtDescprod.getText();
        String txtPrcvenprodValue = txtPrcvenprod.getText();
        String txtQtdprodValue = txtQtdprod.getText();
        String idText = id.getText();
        if (idText.isEmpty() || txtCodprodValue.isEmpty() || txtDescprodValue.isEmpty()
                || txtQtdprodValue.isEmpty() || txtPrcvenprodValue.isEmpty()) {
            lblAlerta.setText("É necessário escolher um produto em \"CONSULTA\"");
        } else {
            Session session = factory.openSession();
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                Integer idProd = Integer.parseInt(id.getText());
                System.out.println(idProd);
                
                Produtos produto = new Produtos(idProd);
                session.delete(produto);
                session.flush();
                tx.commit();
                
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                e.printStackTrace();
            } finally {
                session.close();
            }
            lblAlerta.setText("Produto Excluido com Sucesso!");
            txtCodprod.setText("");
            txtDescprod.setText("");
            txtPrcvenprod.setText("");
            txtQtdprod.setText("");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed
    
    private void alterarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarBtnActionPerformed
        String txtCodprodValue = txtCodprod.getText();
        String txtDescprodValue = txtDescprod.getText();
        String txtPrcvenprodValue = txtPrcvenprod.getText();
        String txtQtdprodValue = txtQtdprod.getText();
        String idText = id.getText();
        if (idText.isEmpty() || txtCodprodValue.isEmpty() || txtDescprodValue.isEmpty()
                || txtQtdprodValue.isEmpty() || txtPrcvenprodValue.isEmpty()) {
            lblAlerta.setText("É necessário escolher um produto em \"CONSULTA\"");
        } else {
            confAlteracaoBtn.setVisible(true);
            altCancelBtn.setVisible(true);
            txtCodprod.setEditable(false);
            txtCodprod.setBackground(Color.LIGHT_GRAY);
            consultaBtn.setVisible(false);
            alterarBtn.setVisible(false);
            btnIncluir.setVisible(false);
            deleteBtn.setVisible(false);
            relatorioBtn.setVisible(false);
        }
    }//GEN-LAST:event_alterarBtnActionPerformed
    
    private void confAlteracaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confAlteracaoBtnActionPerformed
        String idProd = id.getText();
        String txtCodprodValue = txtCodprod.getText();
        String txtDescprodValue = txtDescprod.getText();
        String txtPrcvenprodValue = txtPrcvenprod.getText();
        BigDecimal novotxtPrcvenprodValue = new BigDecimal(txtPrcvenprodValue.replace(",", "."));
        String txtQtdprodValue = txtQtdprod.getText();
        if (id.getText() == "id" || txtCodprodValue.isEmpty() || txtDescprodValue.isEmpty()
                || txtQtdprodValue.isEmpty() || novotxtPrcvenprodValue.compareTo(BigDecimal.ZERO) <= 0) {
            lblAlerta.setText("É necessário escolher um produto em \"CONSULTA\"");
        } else {
            Produtos produto = new Produtos();
            produto.setCodProd(txtCodprodValue);
            produto.setDescProd(txtDescprodValue);
            produto.setQtdProd(Integer.parseInt(txtQtdprodValue));
            produto.setPrecoProd(novotxtPrcvenprodValue);
            produto.setId(Integer.parseInt(idProd));
            Session session = factory.openSession();
            Transaction tx = null;
            try {
                tx = session.beginTransaction();
                System.out.println(idProd);
                session.update(produto);
                session.flush();
                tx.commit();
                
            } catch (HibernateException e) {
                if (tx != null) {
                    tx.rollback();
                }
                e.printStackTrace();
            } finally {
                session.close();
            }
            lblAlerta.setText("Produto Alterado com Sucesso!");
            txtCodprod.setText("");
            txtDescprod.setText("");
            txtPrcvenprod.setText("");
            txtQtdprod.setText("");
            confAlteracaoBtn.setVisible(false);
            altCancelBtn.setVisible(false);
            txtCodprod.setEditable(true);
            txtCodprod.setBackground(Color.WHITE);
            consultaBtn.setVisible(true);
            alterarBtn.setVisible(true);
            btnIncluir.setVisible(true);
            deleteBtn.setVisible(true);
            relatorioBtn.setVisible(true);
        }
    }//GEN-LAST:event_confAlteracaoBtnActionPerformed
    
    private void altCancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altCancelBtnActionPerformed
        confAlteracaoBtn.setVisible(false);
        altCancelBtn.setVisible(false);
        txtCodprod.setEditable(true);
        txtCodprod.setBackground(Color.WHITE);
        consultaBtn.setVisible(true);
        alterarBtn.setVisible(true);
        btnIncluir.setVisible(true);
        deleteBtn.setVisible(true);
        relatorioBtn.setVisible(true);
    }//GEN-LAST:event_altCancelBtnActionPerformed
    
    private void relatorioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatorioBtnActionPerformed
        Connection conn;
        String src = "src/cad_prod/report1.jasper";
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Novo_Sistema", "postgres", "postgres");
            JasperPrint jasperPrint = null;
            jasperPrint = JasperFillManager.fillReport(src, null, conn);
            JasperViewer viewReport = new JasperViewer(jasperPrint, false);
            viewReport.setVisible(true);
            conn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CadProd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(CadProd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_relatorioBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
            Configuration configuration = new Configuration().configure();
            registry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            //factory = configuration.buildSessionFactory(registry);
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

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
            java.util.logging.Logger.getLogger(CadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager Novo_SistemaPUEntityManager;
    private javax.swing.JButton altCancelBtn;
    private javax.swing.JButton alterarBtn;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton confAlteracaoBtn;
    private javax.swing.JButton consultaBtn;
    private javax.swing.JButton deleteBtn;
    public javax.swing.JLabel id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlerta;
    private java.util.List<cad_prod.Produtos_1> produtos_1List;
    private javax.persistence.Query produtos_1Query;
    private javax.swing.JButton relatorioBtn;
    public javax.swing.JTextField txtCodprod;
    public javax.swing.JTextField txtDescprod;
    public javax.swing.JTextField txtPrcvenprod;
    public javax.swing.JTextField txtQtdprod;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private String checaCodigo(String txtCodprodValue) {
        Session session = factory.openSession();
        String resultado = null;
        String sql = "SELECT cod_prod FROM PRODUTOS WHERE cod_prod = :txtCodprodValue";
        SQLQuery query = session.createSQLQuery(sql);
        query.setString("txtCodprodValue", txtCodprodValue);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        List<HashMap> pk = query.list();
        if (pk.isEmpty()) {
            resultado = null;
        } else {
            resultado = pk.get(0).get("cod_prod").toString();
        }
        session.close();
        if (resultado != null) {
            return resultado;
        }
        return null;
    }
}
