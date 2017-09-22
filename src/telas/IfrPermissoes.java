/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.TratarCampos;
import apoio.templateTitulos;
import dao.DAO;
import dao.EnderecoDAO;
import dao.PermissoesDAO;
import dao.PessoaDAO;
import dao.ProdutosDAO;
import entidades.Endereco;
import entidades.Pessoas;
import entidades.Permissoes;
import entidades.Usuarios;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class IfrPermissoes extends javax.swing.JInternalFrame {

    int codigo = 0;
    int status;
    PermissoesDAO pDAO;
    Permissoes p;

    public IfrPermissoes() {
        setTitle("Cadastro de Permissões");
        initComponents();
        this.setSize(800, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new PermissoesDAO().popularTabela(tblPermisoes, title);
        statusCampos(false);
        btnCancelar.setEnabled(false);
        tfdId.setVisible(false);

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
        tfdDescricao = new javax.swing.JTextField();
        tfdId = new javax.swing.JLabel();
        btnTela = new javax.swing.JCheckBox();
        btnEdicao = new javax.swing.JCheckBox();
        btnIncluir = new javax.swing.JCheckBox();
        btnEexcluirr = new javax.swing.JCheckBox();
        btnConsultar = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPermisoes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfdPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

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
        setTitle("Cadastro - Permissões");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("*Descrição:");

        tfdId.setText("0");

        btnTela.setText("Permissão Visualizar Tela");

        btnEdicao.setText("Permissão de Editar registros");

        btnIncluir.setText("Permissão de Incluir registros");

        btnEexcluirr.setText("Permissão de Excluir registros");

        btnConsultar.setText("Permissão de Consultar registros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTela)
                            .addComponent(btnEdicao)
                            .addComponent(btnIncluir)
                            .addComponent(btnEexcluirr)
                            .addComponent(btnConsultar))))
                .addContainerGap(792, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(btnTela)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEexcluirr)
                .addGap(3, 3, 3)
                .addComponent(btnConsultar)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        abaManutencao.addTab("Manutenção", jPanel1);

        tblPermisoes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPermisoes);

        jLabel2.setText("Busca");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 680, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnEditar)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        abaManutencao.addTab("Consulta", jPanel2);

        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSalvar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSalvar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(90, 25));
        btnSair.setMinimumSize(new java.awt.Dimension(90, 25));
        btnSair.setPreferredSize(new java.awt.Dimension(90, 25));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abaManutencao, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaManutencao, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        controleAtualizacao();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        PermissoesDAO per = new PermissoesDAO();
        DAO d = new DAO();
        Object obj = tblPermisoes.getValueAt(tblPermisoes.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = per.consultarID(Integer.parseInt(str));
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
        if (confirma == JOptionPane.YES_OPTION) {
            d.excluir(p);
            JOptionPane.showMessageDialog(null, "Item excluído com sucesso!");
            new ProdutosDAO().popularTabela(tblPermisoes, title);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir registro!");
        }
        new PermissoesDAO().popularTabela(tblPermisoes, title);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        PermissoesDAO per = new PermissoesDAO();
        Permissoes p = new Permissoes();
        DAO d = new DAO();
        Object obj = tblPermisoes.getValueAt(tblPermisoes.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = per.consultarID(Integer.parseInt(str));
        tfdId.setText(p.getId() + "");
        tfdDescricao.setText(p.getDescricao());
        btnTela.setSelected(p.getPermissaovisibilidadetela());
        btnEdicao.setSelected(p.getPermissaoedicaotela());
        btnIncluir.setSelected(p.getPermissaobtninclusao());
        btnEexcluirr.setSelected(p.getPermissaobtnexclusao());
        btnConsultar.setSelected(p.getPermissaoconsulta());

        abaManutencao.setSelectedIndex(0);
        btnSalvar.setText(templateTitulos.getBtnAtualizar());
        new PermissoesDAO().popularTabela(tblPermisoes, title);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        statusCampos(false);
        btnCancelar.setText(templateTitulos.getBtnCancelar());
        btnCancelar.setEnabled(false);
        TratarCampos.limparCampos(jPanel1);
        TratarCampos.setaBorda(jPanel1, false);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new PermissoesDAO().popularTabela(tblPermisoes, title);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void statusCampos(boolean status) {
        tfdDescricao.setEnabled(status);

    }

    private void controleAtualizacao() {
        PermissoesDAO per = new PermissoesDAO();
        switch (status) {
            case 0:
                statusCampos(true);
                btnSalvar.setText(templateTitulos.getBtnSalvar());
                btnCancelar.setEnabled(true);
                TratarCampos.trataObrigatorios(tfdDescricao);
                status++;
                tfdDescricao.requestFocus();

                break;
            case 1:

                if (TratarCampos.verificaVazios(jPanel1)) {
                    DAO<Permissoes> dao = new DAO<Permissoes>();
                    Permissoes p = new Permissoes();
                    p.setId(Integer.parseInt(tfdId.getText()));
                    p.setDescricao(tfdDescricao.getText());
                    System.out.println(btnTela.isSelected());
                    p.setPermissaovisibilidadetela(btnTela.isSelected());
                    p.setPermissaobtnedicao(btnEdicao.isSelected());
                    p.setPermissaobtninclusao(btnIncluir.isSelected());
                    p.setPermissaobtnexclusao(btnEexcluirr.isSelected());
                    p.setPermissaoconsulta(btnConsultar.isSelected());
                    p.setSituacao("a");
                    if (p.getId() == 0) {
                        dao.salvar(p);
                        new PermissoesDAO().popularTabela(tblPermisoes, title);
                    } else {
                        dao.atualizar(p);
                        new PermissoesDAO().popularTabela(tblPermisoes, title);
                    }
                    System.out.println("cheguei aqui");
                    JOptionPane.showMessageDialog(null, templateTitulos.getMsgOpSalvo());
                    TratarCampos.limparCampos(jPanel1);
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
    private javax.swing.JCheckBox btnConsultar;
    private javax.swing.JCheckBox btnEdicao;
    private javax.swing.JButton btnEditar;
    private javax.swing.JCheckBox btnEexcluirr;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JCheckBox btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox btnTela;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblPermisoes;
    private javax.swing.JTextField tfdDescricao;
    private javax.swing.JLabel tfdId;
    private javax.swing.JTextField tfdPesquisar;
    // End of variables declaration//GEN-END:variables
}
