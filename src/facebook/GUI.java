/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Dongl
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public String until,token;
    public GUI() {
        initComponents();
         // get current time
          DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
          Date date = new Date();
          until=dateFormat.format(date);
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        token_text = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        post_id = new javax.swing.JTextField();
        post_get = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        group_name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        since_group = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        page_name = new javax.swing.JTextField();
        page_get = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        since_page = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        likes_panel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        likes_table = new javax.swing.JTable();
        comments_panel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        comments_table = new javax.swing.JTable();
        shares_panel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        share_table = new javax.swing.JTable();
        members_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        member_table = new javax.swing.JTable();
        all_panel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        all_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facebook/logo.JPG"))); // NOI18N
        jButton1.setText("Log In");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        token_text.setEditable(false);
        token_text.setText("Access Token");
        token_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                token_textActionPerformed(evt);
            }
        });

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setText("Post ID");

        post_id.setText("1588374991413831");

        post_get.setText("Get Data");
        post_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                post_getActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(77, 77, 77)
                .addComponent(post_id, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(post_get)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(post_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(post_get))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Post", jPanel2);

        jLabel1.setText("Group Link");

        group_name.setText("https://www.facebook.com/groups/1520313941553270/");

        jButton2.setText("Get Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Since");

        since_group.setText("dd/mm/yyyy");

        jLabel3.setText("1 week from now at least");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(since_group, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3))
                            .addComponent(group_name, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jButton2)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(group_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(since_group, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Group", jPanel1);

        jLabel5.setText("Page link");

        page_name.setText("https://www.facebook.com/AldoraMattresses");

        page_get.setText("Get Data");
        page_get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                page_getActionPerformed(evt);
            }
        });

        jLabel6.setText("Since");

        jLabel7.setText("1 week from now at least");

        since_page.setText("dd/mm/yyyy");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(since_page, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel7))
                            .addComponent(page_name, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(page_get)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(page_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(since_page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(page_get)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Page", jPanel3);

        likes_table.setBorder(new javax.swing.border.MatteBorder(null));
        likes_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(likes_table);

        javax.swing.GroupLayout likes_panelLayout = new javax.swing.GroupLayout(likes_panel);
        likes_panel.setLayout(likes_panelLayout);
        likes_panelLayout.setHorizontalGroup(
            likes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likes_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        likes_panelLayout.setVerticalGroup(
            likes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likes_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Likes", likes_panel);

        comments_table.setBorder(new javax.swing.border.MatteBorder(null));
        comments_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(comments_table);

        javax.swing.GroupLayout comments_panelLayout = new javax.swing.GroupLayout(comments_panel);
        comments_panel.setLayout(comments_panelLayout);
        comments_panelLayout.setHorizontalGroup(
            comments_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comments_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        comments_panelLayout.setVerticalGroup(
            comments_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comments_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Comments", comments_panel);

        share_table.setBorder(new javax.swing.border.MatteBorder(null));
        share_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(share_table);

        javax.swing.GroupLayout shares_panelLayout = new javax.swing.GroupLayout(shares_panel);
        shares_panel.setLayout(shares_panelLayout);
        shares_panelLayout.setHorizontalGroup(
            shares_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shares_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        shares_panelLayout.setVerticalGroup(
            shares_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shares_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Shares", shares_panel);

        member_table.setBorder(new javax.swing.border.MatteBorder(null));
        member_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(member_table);

        javax.swing.GroupLayout members_panelLayout = new javax.swing.GroupLayout(members_panel);
        members_panel.setLayout(members_panelLayout);
        members_panelLayout.setHorizontalGroup(
            members_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(members_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        members_panelLayout.setVerticalGroup(
            members_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(members_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Group Members", members_panel);

        all_table.setBorder(new javax.swing.border.MatteBorder(null));
        all_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(all_table);

        javax.swing.GroupLayout all_panelLayout = new javax.swing.GroupLayout(all_panel);
        all_panel.setLayout(all_panelLayout);
        all_panelLayout.setHorizontalGroup(
            all_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_panelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        all_panelLayout.setVerticalGroup(
            all_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(all_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("All   ", all_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(token_text))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(token_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void token_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_token_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_token_textActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(token_text.getText().equals("Access Token"))
        {
             JOptionPane.showMessageDialog(null, "Please Log In First", "ERROR " , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Vector <String>ID=new Vector<>();
        Vector <String>name=new Vector<>();
        Map<String,String> group_map = new HashMap<String,String>(); ;
        Map<String,String> all = new HashMap<String,String>();;
        Group g = new Group();
        String since=since_group.getText();
        if(since.equals("dd/mm/yyyy"))
        since="";
        //Group get member from posts
        try {
             //get members
            group_map=g.Get_Members(group_name.getText(),token);
            all.putAll(group_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

           
            for (Map.Entry<String, String> entry : group_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
            
        DefaultTableModel member_model = new DefaultTableModel();
        member_model.addColumn("ID",ID);
        member_model.addColumn("Name",name);
        member_table.setModel(member_model);
        
        try {
            g.get_Post(group_name.getText(),token,since);
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ID.clear();
        name.clear();
        try {
            //likes
            
            group_map=g.get_GroupLikes(token);
            all.putAll(group_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : group_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel likes_model = new DefaultTableModel();
        likes_model.addColumn("ID",ID);
        likes_model.addColumn("Name",name);
        likes_table.setModel(likes_model);
        
        //comments
        ID.clear();
        name.clear();
        try {
            group_map=g.get_GroupComments(token);
            all.putAll(group_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : group_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel comment_model = new DefaultTableModel();
        comment_model.addColumn("ID",ID);
        comment_model.addColumn("Name",name);
        comments_table.setModel(comment_model);
        
        //shares
        ID.clear();
        name.clear();
        try {
            group_map=g.get_GroupShares(token);
            all.putAll(group_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : group_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel share_model = new DefaultTableModel();
        share_model.addColumn("ID",ID);
        share_model.addColumn("Name",name);
        share_table.setModel(share_model);
      
        //all
        ID.clear();
        name.clear();
       
         for (Map.Entry<String, String> entry : all.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel all_model = new DefaultTableModel();
        all_model.addColumn("ID",ID);
        all_model.addColumn("Name",name);
        all_table.setModel(all_model);
        
        if(all.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "No Data", "OPPPS" , JOptionPane.INFORMATION_MESSAGE);
        }
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connect connect = new Connect();
        connect.connect();
        try {
             token = connect.Get_Token();
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        token_text.setText(token);   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void post_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_post_getActionPerformed
        
         if(token_text.getText().equals("Access Token"))
        {
             JOptionPane.showMessageDialog(null, "Please Log In First", "ERROR " , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Vector <String>ID=new Vector<>();
        Vector <String>name=new Vector<>();
        Map<String,String> post_map = new HashMap<String,String>(); ;
        Map<String,String> all = new HashMap<String,String>();;
        Post g = new Post();
      

        try {
            //likes
       
            post_map=g.get_Post_likes(post_id.getText(),token);
            all.putAll(post_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : post_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel likes_model = new DefaultTableModel();
        likes_model.addColumn("ID",ID);
        likes_model.addColumn("Name",name);
        likes_table.setModel(likes_model);
        
        //comments
        ID.clear();
        name.clear();
        try {
            post_map=g.get_Post_comments(post_id.getText(), token);
            all.putAll(post_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : post_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel comment_model = new DefaultTableModel();
        comment_model.addColumn("ID",ID);
        comment_model.addColumn("Name",name);
        comments_table.setModel(comment_model);
        
        //shares
        ID.clear();
        name.clear();
        try {
            post_map=g.get_Post_shares(post_id.getText(), token);
            all.putAll(post_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : post_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel share_model = new DefaultTableModel();
        share_model.addColumn("ID",ID);
        share_model.addColumn("Name",name);
        share_table.setModel(share_model);
      
        //all
        ID.clear();
        name.clear();
       
         for (Map.Entry<String, String> entry : all.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel all_model = new DefaultTableModel();
        all_model.addColumn("ID",ID);
        all_model.addColumn("Name",name);
        all_table.setModel(all_model);
        
         if(all.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "No Data", "OPPPS" , JOptionPane.INFORMATION_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_post_getActionPerformed

    private void page_getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_page_getActionPerformed
       if(token_text.getText().equals("Access Token"))
        {
             JOptionPane.showMessageDialog(null, "Please Log In First", "ERROR " , JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        Vector <String>ID=new Vector<>();
        Vector <String>name=new Vector<>();
        Map<String,String> page_map = new HashMap<String,String>(); ;
        Map<String,String> all = new HashMap<String,String>();;
        Page g = new Page();
        String since=since_page.getText();
            
        if(since.equals("dd/mm/yyyy"))
        since="";
        //get posts from page
       
        try {
             //use get member to get members
            g.get_Post(page_name.getText(),token,since);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        try {
            //likes
            
            page_map=g.get_pageLikes(token);
            all.putAll(page_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : page_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel likes_model = new DefaultTableModel();
        likes_model.addColumn("ID",ID);
        likes_model.addColumn("Name",name);
        likes_table.setModel(likes_model);
        
        //comments
        ID.clear();
        name.clear();
        try {
            page_map=g.get_pageComments(token);
            all.putAll(page_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : page_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel comment_model = new DefaultTableModel();
        comment_model.addColumn("ID",ID);
        comment_model.addColumn("Name",name);
        comments_table.setModel(comment_model);
        
        //shares
        ID.clear();
        name.clear();
        try {
            page_map=g.get_pageShares(token);
            all.putAll(page_map);
            } catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         for (Map.Entry<String, String> entry : page_map.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel share_model = new DefaultTableModel();
        share_model.addColumn("ID",ID);
        share_model.addColumn("Name",name);
        share_table.setModel(share_model);
      
        //all
        ID.clear();
        name.clear();
       
         for (Map.Entry<String, String> entry : all.entrySet())
            {
                ID.add(entry.getKey());
                name.add(entry.getValue());
            }
        DefaultTableModel all_model = new DefaultTableModel();
        all_model.addColumn("ID",ID);
        all_model.addColumn("Name",name);
        all_table.setModel(all_model);
        
         if(all.isEmpty())
        {
             JOptionPane.showMessageDialog(null, "No Data", "OPPPS" , JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_page_getActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all_panel;
    private javax.swing.JTable all_table;
    private javax.swing.JPanel comments_panel;
    private javax.swing.JTable comments_table;
    private javax.swing.JTextField group_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel likes_panel;
    private javax.swing.JTable likes_table;
    private javax.swing.JTable member_table;
    private javax.swing.JPanel members_panel;
    private javax.swing.JButton page_get;
    private javax.swing.JTextField page_name;
    private javax.swing.JButton post_get;
    private javax.swing.JTextField post_id;
    private javax.swing.JTable share_table;
    private javax.swing.JPanel shares_panel;
    private javax.swing.JTextField since_group;
    private javax.swing.JTextField since_page;
    private javax.swing.JTextField token_text;
    // End of variables declaration//GEN-END:variables
}