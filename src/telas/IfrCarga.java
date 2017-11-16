/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.TratarCampos;
import apoio.templateTitulos;
import dao.DAO;
import dao.PedidoDAO;
import dao.PessoaDAO;
import dao.UsuarioDAO;
import entidades.Pedido;
import entidades.Pessoas;
import entidades.Usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import apoio.Calendario;
import java.util.GregorianCalendar;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class IfrCarga extends javax.swing.JInternalFrame {

    int codigo = 0;
    int status;
    PedidoDAO pDAO;
    Pedido p;
    Calendario c = new Calendario();
    int cod;

    public IfrCarga() {
        System.out.println(c.obterDataAtualDMA());
        setTitle("Cadastro de Pedidos");
        initComponents();
        this.setSize(800, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new PedidoDAO().popularTabela(tblPedido, title);
        statusCampos(false);
        //btnCancelar.setEnabled(false);
        tfdId.setVisible(false);
        btnCancelar.setEnabled(false);
        new DAO().definirPermissoes(this);
        //System.out.println(c.obterHoraAtual());
        // tfdData.setText(c.obterDataAtualDMA());
        // tfdHora.setText(c.obterHoraAtual());
        //jProdutos.setEnabled(false);
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnSair1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        abaManutencao = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfdUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdPessoa = new javax.swing.JTextField();
        tfdId = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        tfdData = new javax.swing.JFormattedTextField();
        btnTela = new javax.swing.JButton();
        btnTela1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnTela2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        btnSair1.setText("Sair");
        btnSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair1ActionPerformed(evt);
            }
        });

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Cadastro - Cargas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("IfrPedido"); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("*Pedido:");

        tfdUsuario.setName("btnSalvar"); // NOI18N

        jLabel3.setText("*Caminhão:");

        tfdId.setText("0");

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSalvar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSalvar.setName("btnSalvar"); // NOI18N
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnCancelar.setName("btnCancelar"); // NOI18N
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSair.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSair.setName("btnSair"); // NOI18N
        btnSair.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel4.setText("*Data:");

        btnTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaActionPerformed(evt);
            }
        });

        btnTela1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela1ActionPerformed(evt);
            }
        });

        jLabel2.setText("*Endereço:");

        btnTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTela2ActionPerformed(evt);
            }
        });

        jLabel7.setText("*Nota fiscal:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfdData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdPessoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(tfdUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tfdId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tfdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTela, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        abaManutencao.addTab("Manutenção", jPanel1);

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPedido);

        btnEditar.setText("Editar");
        btnEditar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnEditar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnEditar.setName("btnEditar"); // NOI18N
        btnEditar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(90, 25));
        btnExcluir.setMinimumSize(new java.awt.Dimension(90, 25));
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.setPreferredSize(new java.awt.Dimension(90, 25));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair2.setText("Sair");
        btnSair2.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSair2.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSair2.setName("btnSair"); // NOI18N
        btnSair2.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSair2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        abaManutencao.addTab("Consulta", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaManutencao)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(abaManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
        PedidoDAO pd = new PedidoDAO();
        Pedido p = new Pedido();
        DAO d = new DAO();
        Object obj = tblPedido.getValueAt(tblPedido.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = pd.consultarID(Integer.parseInt(str));
        if (confirma == JOptionPane.YES_OPTION) {
            d.excluir(p);
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro");
        }
        new PedidoDAO().popularTabela(tblPedido, title);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        PedidoDAO pd = new PedidoDAO();
        Pedido p = new Pedido();
        Pessoas pe = new Pessoas();
        UsuarioDAO udao = new UsuarioDAO();
        DAO d = new DAO();
        Object obj = tblPedido.getValueAt(tblPedido.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = pd.consultarID(Integer.parseInt(str));
        tfdId.setText(p.getId() + "");
        tfdUsuario.setText(Integer.toString(p.getId()));
        tfdPessoa.setText(Integer.toString(p.getId()));
        //tfdData.setText(p.getDatatime());
        abaManutencao.setSelectedIndex(0);
        btnSalvar.setText(templateTitulos.getBtnAtualizar());
        new PedidoDAO().popularTabela(tblPedido, title);
    }//GEN-LAST:event_btnEditarActionPerformed
    void pegaIdDlg(String codigo) {
        tfdUsuario.setText(codigo);
        System.out.println(codigo);
    }

    void pegaIdDlg2(String codigo) {
        tfdPessoa.setText(codigo);
        System.out.println(codigo);
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        statusCampos(false);
        btnCancelar.setText(templateTitulos.getBtnCancelar());
        btnCancelar.setEnabled(false);
        TratarCampos.limparCampos(jPanel1);
        TratarCampos.setaBorda(jPanel1, false);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new PedidoDAO().popularTabela(tblPedido, title);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void btnSair2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSair2ActionPerformed

    private void btnTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaActionPerformed
        
    }//GEN-LAST:event_btnTelaActionPerformed

    private void btnTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela1ActionPerformed
       
    }//GEN-LAST:event_btnTela1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        controleAtualizacao();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTela2ActionPerformed
    private void statusCampos(boolean status) {
        tfdUsuario.setEnabled(status);
        tfdPessoa.setEnabled(status);
        tfdData.setEnabled(status);
       
    }

    private void controleAtualizacao() {
        switch (status) {
            case 0:
                statusCampos(true);
                btnSalvar.setText(templateTitulos.getBtnSalvar());
                btnCancelar.setEnabled(true);
                TratarCampos.trataObrigatorios(tfdUsuario);
                TratarCampos.trataObrigatorios(tfdPessoa);
                TratarCampos.trataObrigatorios(tfdData);
              
                tfdData.setText(c.obterDataAtualDMA());
                
                status++;
                tfdUsuario.requestFocus();

                break;
            case 1:

                if (TratarCampos.verificaVazios(jPanel1)) {
                    System.out.println("entrei");
                    statusCampos(true);
                    DAO<Pedido> dao = new DAO<Pedido>();
                    Pedido pro = new Pedido();
                    Usuarios u = new Usuarios();
                    UsuarioDAO uDAO = new UsuarioDAO();
                    Pessoas p = new Pessoas();
                    PessoaDAO pDAO = new PessoaDAO();
                    u = uDAO.consultarID(Integer.parseInt(tfdUsuario.getText()));
                    pro.setUsuariosId(u.getId());
                    p = pDAO.consultarID(Integer.parseInt(tfdPessoa.getText()));
                    pro.setPessoasId(p);
                    Date data = new Date(System.currentTimeMillis());
                    pro.setData(data);
                    Date hoje = GregorianCalendar.getInstance().getTime();
                    pro.setHora(hoje);
                    pro.setSituacao("a");
                    pro.setId(Integer.parseInt(tfdId.getText()));
                    if (pro.getId() == 0) {
                        dao.salvar(pro);
                      
                        System.out.println(pro.getId());
                        cod = pro.getId();

                        new PedidoDAO().popularTabela(tblPedido, title);
                    } else {
                        dao.atualizar(pro);
                        new PedidoDAO().popularTabela(tblPedido, title);
                    }
                    System.out.println("cheguei aqui");
                    JOptionPane.showMessageDialog(null, templateTitulos.getMsgOpSalvo());
//                    TratarCampos.limparCampos(jPanel1);
                    btnCancelar.setEnabled(false);
                    btnSalvar.setText(templateTitulos.getBtnNovo());
                    statusCampos(false);
                }
                status = 0;
                break;
            default:
                break;
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaManutencao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSair2;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTela;
    private javax.swing.JButton btnTela1;
    private javax.swing.JButton btnTela2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblPedido;
    private javax.swing.JFormattedTextField tfdData;
    private javax.swing.JLabel tfdId;
    private javax.swing.JTextField tfdPessoa;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
