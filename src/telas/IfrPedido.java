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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import apoio.Calendario;
import java.util.GregorianCalendar;
import apoio.ComboItens;
import apoio.CombosDAO;
import dao.FuncoesDAO;
import dao.PedidoProdutoDAO;
import dao.ProdutosDAO;
import entidades.Funcoes;
import entidades.PedidoProdutos;
import entidades.Produtos;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class IfrPedido extends javax.swing.JInternalFrame {

    int codigo = 0;
    int status;
    PedidoDAO pDAO;
    Pedido p;
    Calendario c = new Calendario();
    int cod;

    public IfrPedido() {
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
        jPeso.setVisible(false);
        btnCancelar.setEnabled(false);
        new DAO().definirPermissoes(this);
        //System.out.println(c.obterHoraAtual());
        // tfdData.setText(c.obterDataAtualDMA());
        // tfdHora.setText(c.obterHoraAtual());
        //jProdutos.setEnabled(false);
        btnSalvar2.setEnabled(false);
        btnExcluir1.setEnabled(false);
        new CombosDAO().popularCombo("produtos", jProdutos, "id", "descricao");

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
        jLabel5 = new javax.swing.JLabel();
        tfdData = new javax.swing.JFormattedTextField();
        tfdHora = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jProdutos = new javax.swing.JComboBox();
        btnSalvar2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnExcluir1 = new javax.swing.JButton();
        btnTela = new javax.swing.JButton();
        btnTela1 = new javax.swing.JButton();
        jPeso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
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
        setTitle("Cadastro - Pedidos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("IfrPedido"); // NOI18N

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("*Usuário:");

        tfdUsuario.setName("btnSalvar"); // NOI18N

        jLabel3.setText("*Pessoa:");

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

        jLabel5.setText("*Hora:");

        jLabel6.setText("Selecione os produtos para adicionar ao pedido:");

        jProdutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione:" }));
        jProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jProdutosActionPerformed(evt);
            }
        });

        btnSalvar2.setText("Adicionar");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tabela);

        btnExcluir1.setText("Excluir produtos");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

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

        jPeso.setText("1.200");

        jLabel2.setText("Peso do Pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfdPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(tfdUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tfdData, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(tfdHora))))
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExcluir1)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tfdId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(tfdData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfdPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tfdHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTela, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTela1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
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
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(abaManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        controleAtualizacao();
        
    }//GEN-LAST:event_btnSalvarActionPerformed

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

    private void jProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jProdutosActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed
        /**DAO<PedidoProdutos> dao = new DAO<PedidoProdutos>();
        PedidoProdutos pp = new PedidoProdutos();
        PedidoProdutoDAO ppDAO = new PedidoProdutoDAO();
        Pedido p = new Pedido();
        PedidoDAO pDAO = new PedidoDAO();
        p = pDAO.consultarID(cod);
        pp.setPedidoId(p);

        Produtos pr = new Produtos();
        ProdutosDAO prDAO = new ProdutosDAO();
        ComboItens ci3 = (ComboItens) jProdutos.getSelectedItem();
        pr = prDAO.consultarID(ci3.getCodigo());
        pp.setProdutosId(pr);
        System.out.println(pr);
        pp.setId(Integer.parseInt(tfdId.getText()));

        if (pp.getId() == 0) {
            dao.salvar(pp);
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
            ppDAO.popularTabela(tabela, "");
            jProdutos.setSelectedIndex(0);
        } else {
            dao.atualizar(pp);
        }
*/controleAtualizacao2();
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
       
      int confirma = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
        PedidoProdutoDAO pd = new PedidoProdutoDAO();
        PedidoProdutos p = new PedidoProdutos();
        DAO d = new DAO();
        Object obj = tabela.getValueAt(tabela.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = pd.consultarID(Integer.parseInt(str));
        if (confirma == JOptionPane.YES_OPTION) {
            d.excluir(p);
            JOptionPane.showMessageDialog(null, "Registro excluído!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro");
        }
        new PedidoProdutoDAO().popularTabela(tabela, cod);
   
       
    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaActionPerformed
        IfrPesquisaUsuario2 searchUsu = new IfrPesquisaUsuario2(null, true, this);
        searchUsu.setLocationRelativeTo(this);
        searchUsu.setVisible(true);
    }//GEN-LAST:event_btnTelaActionPerformed

    private void btnTela1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTela1ActionPerformed
        IfrPesquisaPessoa2 searchPes = new IfrPesquisaPessoa2(null, true, this);
        searchPes.setLocationRelativeTo(this);
        searchPes.setVisible(true);
    }//GEN-LAST:event_btnTela1ActionPerformed
    private void statusCampos(boolean status) {
        tfdUsuario.setEnabled(status);
        tfdPessoa.setEnabled(status);
        tfdData.setEnabled(status);
        tfdHora.setEnabled(status);
    }

    private void controleAtualizacao2() {
        switch (status) {
            case 0:
                statusCampos(true);
                btnSalvar.setText(templateTitulos.getBtnSalvar());
                btnCancelar.setEnabled(true);
                //TratarCampos.trataObrigatorios(jTextField1);
                status++;
                jProdutos.requestFocus();

                break;
            case 1:

                if (TratarCampos.verificaVazios(jPanel1)) {
                    System.out.println("entrei");
                    statusCampos(true);
                    DAO<PedidoProdutos> dao = new DAO<PedidoProdutos>();
                    PedidoProdutos pp = new PedidoProdutos();
                    PedidoProdutoDAO ppDAO = new PedidoProdutoDAO();
                    Pedido p = new Pedido();
                    PedidoDAO pDAO = new PedidoDAO();
                    p = pDAO.consultarID(cod);
                    pp.setPedidoId(p);

                    Produtos pr = new Produtos();
                    ProdutosDAO prDAO = new ProdutosDAO();
                    ComboItens ci3 = (ComboItens) jProdutos.getSelectedItem();
                    pr = prDAO.consultarID(ci3.getCodigo());
                    System.out.println(pr);
                    pp.setProdutosId(pr);
                    pp.setPeso(Double.parseDouble(jPeso.getText()));
                    pp.setId(Integer.parseInt(tfdId.getText()));
                    if (pp.getId() == 0) {
                        dao.salvar(pp);
                        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
                        new PedidoProdutoDAO().popularTabela(tabela, cod);
                        jProdutos.setSelectedIndex(0);
                    } else {
                        dao.atualizar(pp);
                        new PedidoProdutoDAO().popularTabela(tabela, cod);

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

private void controleAtualizacao() {
        switch (status) {
            case 0:
                statusCampos(true);
                btnSalvar.setText(templateTitulos.getBtnSalvar());
                btnCancelar.setEnabled(true);
                TratarCampos.trataObrigatorios(tfdUsuario);
                TratarCampos.trataObrigatorios(tfdPessoa);
                TratarCampos.trataObrigatorios(tfdData);
                TratarCampos.trataObrigatorios(tfdHora);
                tfdData.setText(c.obterDataAtualDMA());
                tfdHora.setText(c.obterHoraAtual());
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
                        jProdutos.setEnabled(true);
                        btnSalvar2.setEnabled(true);
                        btnExcluir1.setEnabled(true);
                        System.out.println(pro.getId());
                        cod = pro.getId();

                        new PedidoDAO().popularTabela(tblPedido, title);
                        btnSalvar2.setVisible(true);
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
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSair2;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JButton btnTela;
    private javax.swing.JButton btnTela1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jPeso;
    private javax.swing.JComboBox jProdutos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tblPedido;
    private javax.swing.JFormattedTextField tfdData;
    private javax.swing.JTextField tfdHora;
    private javax.swing.JLabel tfdId;
    private javax.swing.JTextField tfdPessoa;
    private javax.swing.JTextField tfdUsuario;
    // End of variables declaration//GEN-END:variables
}
