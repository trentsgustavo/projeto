/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import apoio.TratarCampos;
import apoio.templateTitulos;
import dao.DAO;
import dao.ProdutosDAO;
import dao.UsuarioDAO;
import dao.TelasDAO;
import dao.Usuarios_has_permissoesDAO;
import entidades.Permissoes;
import entidades.Produtos;
import entidades.Usuarios;
import entidades.Usuarios_has_permissoes;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Tainá Fiegenbaum
 */
public class IfrProduto extends javax.swing.JInternalFrame {
    
    int codigo = 0;
    int status;
    ProdutosDAO pDAO;
    Produtos p;
    UsuarioDAO usDAO;
    Usuarios us;
    TelasDAO tDAO;
    Permissoes pe;
    Usuarios_has_permissoes upe;
    Usuarios_has_permissoesDAO udao;
    
    public IfrProduto() {
        setTitle("Cadastro de Produtos");
        initComponents();
        this.setSize(800, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new ProdutosDAO().popularTabela(tblProdutos, title);
        statusCampos(false);
        //btnCancelar.setEnabled(false);
        tfdId.setVisible(false);
        definirPermissoes(this);
        Container tela =this;
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
        tfdNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfdPeso = new javax.swing.JTextField();
        tfdId = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfdPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

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
        setTitle("Cadastro - Produtos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("*Nome:");

        jLabel3.setText("*Peso:");

        tfdId.setText("0");

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfdPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addComponent(tfdNome))
                    .addComponent(tfdId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(tfdId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfdPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        abaManutencao.addTab("Manutenção", jPanel1);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblProdutos);

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
                                .addGap(73, 73, 73)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 369, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                        .addComponent(abaManutencao)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(abaManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnExcluir)))
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
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma exclusão?");
        ProdutosDAO pd = new ProdutosDAO();
        Produtos p = new Produtos();
        DAO d = new DAO();
        Object obj = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = pd.consultarID(Integer.parseInt(str));
        if(confirma == JOptionPane.YES_OPTION){
        d.excluir(p);
        JOptionPane.showMessageDialog(null, "Registro excluído!");
        }else{
        JOptionPane.showMessageDialog(null, "Erro ao excluir registro");    
        }
        new ProdutosDAO().popularTabela(tblProdutos, title);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ProdutosDAO pd = new ProdutosDAO();
        Produtos p = new Produtos();
        DAO d = new DAO();
        Object obj = tblProdutos.getValueAt(tblProdutos.getSelectedRow(), 0);
        String str = String.valueOf(obj);
        p = pd.consultarID(Integer.parseInt(str));
        tfdId.setText(p.getId()+"");
        tfdNome.setText(p.getDescricao());
        tfdPeso.setText(p.getPeso()+"");
        abaManutencao.setSelectedIndex(0);
        btnSalvar.setText(templateTitulos.getBtnAtualizar());
        new ProdutosDAO().popularTabela(tblProdutos, title);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        statusCampos(false);
        btnCancelar.setText(templateTitulos.getBtnCancelar());
        btnCancelar.setEnabled(false);
        TratarCampos.limparCampos(jPanel1);
        TratarCampos.setaBorda(jPanel1, false);
        btnSalvar.setText(templateTitulos.getBtnNovo());
        new ProdutosDAO().popularTabela(tblProdutos, title);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSair1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void statusCampos(boolean status) {
        tfdNome.setEnabled(status);
        tfdPeso.setEnabled(status);
    }
    
    private void controleAtualizacao() {
        switch (status) {
            case 0:
                statusCampos(true);
                btnSalvar.setText(templateTitulos.getBtnSalvar());
                btnCancelar.setEnabled(true);
                TratarCampos.trataObrigatorios(tfdNome);
                TratarCampos.trataObrigatorios(tfdPeso);
                status++;
                tfdNome.requestFocus();
                
                break;
            case 1:
                
                if (TratarCampos.verificaVazios(jPanel1)) {
                    System.out.println("entrei");
                    statusCampos(true);
                    
                    DAO<Produtos> dao = new DAO<Produtos>();
                    Produtos pro = new Produtos();
                    pro.setDescricao(tfdNome.getText());
                    pro.setPeso(Double.parseDouble(tfdPeso.getText()));
                    pro.setId(Integer.parseInt(tfdId.getText()));
                    pro.setSituacao("a");
                    if(pro.getId()==0){
                        dao.salvar(pro);
                        new ProdutosDAO().popularTabela(tblProdutos, title);
                    }else{
                        dao.atualizar(pro);
                        new ProdutosDAO().popularTabela(tblProdutos, title);
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
    public void definirPermissoes(Container tela) {
        System.out.println("entrei no definir permissões");
        List<Component> componentList = new ArrayList<Component>();
        componentList = getAllComponents(tela);

        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.beginTransaction();

        List<Object[]> resultado = sessao.createSQLQuery("select pe.descricao, pe.id from usuarios_has_permissoes up"
                + " left join permissoes pe on (up.permissoes_id = pe.id)"
                + " left join telas tl on (pe.telas_id = tl.id)"
                + " where tl.descricao = '" + tela.getName() + "'"
                + " and up.usuarios_id = " + System.getProperty("usuarios_id")).list();

        for (int j = 0; j < componentList.size(); j++) {
            System.out.println("aquiiiiiiiiiii");
            for (Object[] o : resultado) {
                System.out.println("aquiiiiiiiiiii");
                if (componentList.get(j).getName().equals(o[0].toString())) {
                    System.out.println("aquiiiiiiiiiii");
                    componentList.get(j).setEnabled(false);
                }

            }
        }
    }
    
     public static List<Component> getAllComponents(final Container c) {
        Component[] comps = c.getComponents();
        List<Component> compList = new ArrayList<Component>();
        for (Component comp : comps) {
            if (comp instanceof JButton && comp.getName() != null) {
                compList.add(comp);
            } else if (comp instanceof JTextField && comp.getName() != null) {
                compList.add(comp);
            } else if (comp instanceof JCheckBox && comp.getName() != null) {
                compList.add(comp);
            } else if (comp instanceof Container) {
                compList.addAll(getAllComponents((Container) comp));
            }
        }
        return compList;
    }
    private void aplicaPermissao() {
        List<Object> telas = null;
         //for (Object o : telas) {
        upe = udao.consultarID(us.getId());
        if (pe.getTelasId().getDescricao() == "IfrProduto"){
            btnSalvar.setEnabled(pe.getSituacao());
            
        }
        else{
             JOptionPane.showMessageDialog(null, "Você não tem permissão para esta tela!");
                    this.dispose();
        }
         
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaManutencao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JLabel tfdId;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdPeso;
    private javax.swing.JTextField tfdPesquisar;
    // End of variables declaration//GEN-END:variables
}
