/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.dretve.DretvaAzuriranjeKalendara;
import controler.dretve.DretvaSat;
import controler.kalendar.MetodeDogadaja;
import static controler.kalendar.MetodeDogadaja.generirajKalendar;
import controler.kalendar.MetodeKalendara;
import static controler.kalendar.MetodeKalendara.getListaDanas;
import controler.meteo.MetodeMeteo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.kalendar.Datum;
import model.kalendar.Dogadaj;

/**
 *
 * @author iduras
 */
public class Pocetna extends javax.swing.JFrame {

    static List<List<Datum>> listaListaDatuma = new ArrayList<List<Datum>>();
    
    Date danasnjiDatum = new Date(System.currentTimeMillis());
    
    int tekucaGodina = Calendar.getInstance().get(Calendar.YEAR);
    /**
     * Creates new form Pocetna
     */
    public Pocetna() {
        initComponents();
        DretvaSat.getInstanca().start();
        DretvaAzuriranjeKalendara.getInstanca().start();
        try {
            MetodeKalendara.generirajPrikaz(MetodeKalendara.getURLKalendaraGooglePosao(), Dogadaj.getListaSvihDogadaja(), jTableKalendar, jTableTablicaDogadaja, jTableTablicaDogadajaZaTjedanDana, jTextFieldGodina, listaListaDatuma, Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
            MetodeMeteo.generirajPrikazMeteo("Varazdin", "HR", Pocetna.getjPanelDanas(), Pocetna.getjPanePrognoza());
        } 
        
        catch (Exception e) {
            Pocetna.getjTextFieldPoruka().setText("Greška. Pokušaj kliknuti na gumb 'Osvježi'.");
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

        jTextFieldDanasnjiDatum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKalendar = new javax.swing.JTable();
        jTextFieldPoruka = new javax.swing.JTextField();
        jButtonPrijasnjiMjesec = new javax.swing.JButton();
        jButtonSljedeciMjesec = new javax.swing.JButton();
        jComboBoxMjeseci = new javax.swing.JComboBox<>();
        jTextFieldGodina = new javax.swing.JTextField();
        jButtonDanas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTablicaDogadaja = new javax.swing.JTable();
        jLabelOdabraniDatum = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTablicaDogadajaZaTjedanDana = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonOsvjezi = new javax.swing.JButton();
        jPanelDanas = new javax.swing.JPanel();
        jPanePrognoza = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.gray);

        jTextFieldDanasnjiDatum.setEditable(false);
        jTextFieldDanasnjiDatum.setText("jTextField1");

        jTableKalendar.setBackground(new java.awt.Color(153, 153, 153));
        jTableKalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableKalendar.setShowHorizontalLines(true);
        jTableKalendar.setShowVerticalLines(true);
        jTableKalendar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ponedjeljak", "Utorak", "Srijeda", "Četvrtak", "Petak", "Subota", "Nedjelja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableKalendar.setColumnSelectionAllowed(true);
        jTableKalendar.setGridColor(new java.awt.Color(51, 51, 51));
        jTableKalendar.getTableHeader().setReorderingAllowed(false);
        jTableKalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKalendarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKalendar);
        jTableKalendar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableKalendar.getColumnModel().getColumnCount() > 0) {
            jTableKalendar.getColumnModel().getColumn(0).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(1).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(2).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(3).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(4).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(5).setResizable(false);
            jTableKalendar.getColumnModel().getColumn(6).setResizable(false);
        }

        jTextFieldPoruka.setEditable(false);
        jTextFieldPoruka.setBackground(java.awt.Color.gray);
        jTextFieldPoruka.setForeground(java.awt.Color.white);

        jButtonPrijasnjiMjesec.setText("<-");
        jButtonPrijasnjiMjesec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrijasnjiMjesecActionPerformed(evt);
            }
        });

        jButtonSljedeciMjesec.setText("->");
        jButtonSljedeciMjesec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSljedeciMjesecActionPerformed(evt);
            }
        });

        jComboBoxMjeseci.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "Siječanj", "Veljača", "Ožujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac" }));
        jComboBoxMjeseci.setSelectedIndex(Calendar.getInstance().get(Calendar.MONTH));
        jComboBoxMjeseci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMjeseciActionPerformed(evt);
            }
        });

        jTextFieldGodina.setText(Integer.toString(tekucaGodina));

        jButtonDanas.setText("Danas");
        jButtonDanas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDanasActionPerformed(evt);
            }
        });

        jTableTablicaDogadaja.setBackground(new java.awt.Color(153, 153, 153));
        jTableTablicaDogadaja.setShowHorizontalLines(true);
        jTableTablicaDogadaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTablicaDogadaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Opis", "Lokacija", "Počinje", "Završava"
            }
        ));
        jScrollPane2.setViewportView(jTableTablicaDogadaja);

        jLabelOdabraniDatum.setText("Događaji odabranog datuma:");

        jTableTablicaDogadajaZaTjedanDana.setBackground(new java.awt.Color(153, 153, 153));
        jTableTablicaDogadajaZaTjedanDana.setShowHorizontalLines(true);
        jTableTablicaDogadajaZaTjedanDana.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTablicaDogadajaZaTjedanDana.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Opis", "Lokacija", "Počinje", "Završava"
            }
        ));
        jScrollPane3.setViewportView(jTableTablicaDogadajaZaTjedanDana);

        jLabel2.setText("Događaji za sljedećih 7 dana:");

        jButtonOsvjezi.setText("Osvježi");
        jButtonOsvjezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOsvjeziActionPerformed(evt);
            }
        });

        jPanelDanas.setBackground(new java.awt.Color(102, 102, 102));
        jPanelDanas.setForeground(new java.awt.Color(255, 255, 255));
        jPanelDanas.setToolTipText("Prikaz trenutnih vremenskih uvijeta.");
        jPanelDanas.setMaximumSize(new java.awt.Dimension(50, 32767));
        jPanelDanas.setPreferredSize(new java.awt.Dimension(180, 0));

        javax.swing.GroupLayout jPanelDanasLayout = new javax.swing.GroupLayout(jPanelDanas);
        jPanelDanas.setLayout(jPanelDanasLayout);
        jPanelDanasLayout.setHorizontalGroup(
            jPanelDanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanelDanasLayout.setVerticalGroup(
            jPanelDanasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanePrognoza.setBackground(new java.awt.Color(102, 102, 102));
        jPanePrognoza.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanePrognozaLayout = new javax.swing.GroupLayout(jPanePrognoza);
        jPanePrognoza.setLayout(jPanePrognozaLayout);
        jPanePrognozaLayout.setHorizontalGroup(
            jPanePrognozaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanePrognozaLayout.setVerticalGroup(
            jPanePrognozaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOdabraniDatum)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanePrognoza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldDanasnjiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPrijasnjiMjesec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxMjeseci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonSljedeciMjesec)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDanas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonOsvjezi))
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelDanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDanasnjiDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPrijasnjiMjesec)
                            .addComponent(jComboBoxMjeseci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldGodina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSljedeciMjesec)
                            .addComponent(jButtonDanas)
                            .addComponent(jButtonOsvjezi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelDanas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanePrognoza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelOdabraniDatum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Mjenjanje pregleda mjeseca unatrag.
     * @param evt - klik na gumb
     */
    private void jButtonPrijasnjiMjesecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrijasnjiMjesecActionPerformed
        int mjesec = jComboBoxMjeseci.getSelectedIndex() + 1;
        
        mjesec--;
        if (mjesec == 0) {
            mjesec = 12;
            tekucaGodina--;
            jTextFieldGodina.setText(Integer.toString(tekucaGodina));
        }
        jComboBoxMjeseci.setSelectedIndex(mjesec - 1);
        generirajKalendar(jTableKalendar, listaListaDatuma, mjesec, tekucaGodina);
    }//GEN-LAST:event_jButtonPrijasnjiMjesecActionPerformed

    /**
     * Mjenjanje pregleda mjeseca unaprijed.
     * @param evt - klik na gumb
     */
    private void jButtonSljedeciMjesecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSljedeciMjesecActionPerformed
        //dohvacanje trenutnog mjeseca iz comboboxa
        int mjesec = jComboBoxMjeseci.getSelectedIndex() + 1;
        
        //uvecavanje mjeseca
        mjesec++;
        
        //ako mjesec prede 12., resetira se na 1. i povecava se godina
        if (mjesec == 13) {
            mjesec = 1;
            tekucaGodina++;
            jTextFieldGodina.setText(Integer.toString(tekucaGodina));
        }
        
        //selektira se odgovarajuci dan i generira kalendar
        jComboBoxMjeseci.setSelectedIndex(mjesec - 1);
        generirajKalendar(jTableKalendar, listaListaDatuma, mjesec, tekucaGodina);
    }//GEN-LAST:event_jButtonSljedeciMjesecActionPerformed

    /**
     * Pozicionira kalendar na današnji dan.
     * @param evt klik na gumb
     */
    private void jButtonDanasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDanasActionPerformed
        jTextFieldGodina.setText(Integer.toString(Calendar.getInstance().get(Calendar.YEAR)));
        jComboBoxMjeseci.setSelectedIndex(Calendar.getInstance().get(Calendar.MONTH));
        tekucaGodina = Calendar.getInstance().get(Calendar.YEAR);
        generirajKalendar(jTableKalendar,listaListaDatuma,Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
        MetodeDogadaja.generirajPrikazDogadajaDatuma(Pocetna.getjTableTablicaDogadaja(), MetodeKalendara.getListaDanas());
//        getjLabelOdabraniDatum().setText("Prikaz događaja za " + getListaDanas().get(0).getDatumPocetka() + ":");
    }//GEN-LAST:event_jButtonDanasActionPerformed

    private void jComboBoxMjeseciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMjeseciActionPerformed
        generirajKalendar(jTableKalendar,listaListaDatuma, jComboBoxMjeseci.getSelectedIndex() + 1, Calendar.getInstance().get(Calendar.YEAR));
    }//GEN-LAST:event_jComboBoxMjeseciActionPerformed

    private void jTableKalendarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKalendarMouseClicked
        int indexTjedan = jTableKalendar.getSelectedRow();
        int indexDan = jTableKalendar.getSelectedColumn();
        
        MetodeKalendara.azurirajPrikaz(Dogadaj.getListaSvihDogadaja(), jTableKalendar, jTextFieldGodina, listaListaDatuma,  jComboBoxMjeseci.getSelectedIndex()+1, Integer.parseInt(jTextFieldGodina.getText()));
        
        List<Dogadaj> listaDogadaja = listaListaDatuma.get(indexTjedan).get(indexDan).getListaDogadajaDatuma();
        getjLabelOdabraniDatum().setText("Prikaz događaja za " + listaListaDatuma.get(indexTjedan).get(indexDan).dajDatum() + ":");
        
        MetodeDogadaja.generirajPrikazDogadajaDatuma(jTableTablicaDogadaja, listaDogadaja);
    }//GEN-LAST:event_jTableKalendarMouseClicked

    private void jButtonOsvjeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOsvjeziActionPerformed
        try {
            MetodeKalendara.generirajPrikaz(MetodeKalendara.getURLKalendaraGooglePosao(), Dogadaj.getListaSvihDogadaja(), jTableKalendar, jTableTablicaDogadaja, jTableTablicaDogadajaZaTjedanDana, jTextFieldGodina, listaListaDatuma, Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
            MetodeMeteo.generirajPrikazMeteo("Varazdin", "HR", Pocetna.getjPanelDanas(), Pocetna.getjPanePrognoza());
        } 
        
        catch (Exception e) {
            Pocetna.getjTextFieldPoruka().setText("Greška kod osvježavanja.");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButtonOsvjeziActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pocetna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pocetna().setVisible(true);
            }
        });
    }
    
    /**
     * 
     * @param datumZaPrikaz
     */
    public static void prikazLabelOdabraniDan(Date datumZaPrikaz) {
        getjLabelOdabraniDatum().setText("Prikaz događaja za " + datumZaPrikaz + "datum:");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDanas;
    private javax.swing.JButton jButtonOsvjezi;
    private javax.swing.JButton jButtonPrijasnjiMjesec;
    private javax.swing.JButton jButtonSljedeciMjesec;
    private javax.swing.JComboBox<String> jComboBoxMjeseci;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel jLabelOdabraniDatum;
    private static javax.swing.JPanel jPanePrognoza;
    private static javax.swing.JPanel jPanelDanas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private static javax.swing.JTable jTableKalendar;
    private static javax.swing.JTable jTableTablicaDogadaja;
    private static javax.swing.JTable jTableTablicaDogadajaZaTjedanDana;
    public static javax.swing.JTextField jTextFieldDanasnjiDatum;
    private static javax.swing.JTextField jTextFieldGodina;
    public static javax.swing.JTextField jTextFieldPoruka;
    // End of variables declaration//GEN-END:variables

    public static JTable getjTableKalendar() {
        return jTableKalendar;
    }

    public static JTextField getjTextFieldGodina() {
        return jTextFieldGodina;
    }

    public void setjTextFieldGodina(JTextField jTextFieldGodina) {
        Pocetna.jTextFieldGodina = jTextFieldGodina;
    }
    
    public Date getDanasnjiDatum() {
        return danasnjiDatum;
    }

    public void setDanasnjiDatum(Date danasnjiDatum) {
        this.danasnjiDatum = danasnjiDatum;
    }

    public static void setListaListaDogadaja(List<List<Datum>> listaListaDogadaja) {
        Pocetna.listaListaDatuma = listaListaDogadaja;
    }

    public static List<List<Datum>> getListaListaDatuma() {
        return listaListaDatuma;
    }

    public static void setListaListaDatuma(List<List<Datum>> listaListaDatuma) {
        Pocetna.listaListaDatuma = listaListaDatuma;
    }

    public static JTextField getjTextFieldPoruka() {
        return jTextFieldPoruka;
    }

    public static JLabel getjLabelOdabraniDatum() {
        return jLabelOdabraniDatum;
    }

    public static JTable getjTableTablicaDogadaja() {
        return jTableTablicaDogadaja;
    }

    public static JTable getjTableTablicaDogadajaZaTjedanDana() {
        return jTableTablicaDogadajaZaTjedanDana;
    }

    public int getTekucaGodina() {
        return tekucaGodina;
    }

    public JButton getjButtonDanas() {
        return jButtonDanas;
    }

    public JButton getjButtonOsvjezi() {
        return jButtonOsvjezi;
    }

    public JButton getjButtonPrijasnjiMjesec() {
        return jButtonPrijasnjiMjesec;
    }

    public JButton getjButtonSljedeciMjesec() {
        return jButtonSljedeciMjesec;
    }

    public JComboBox<String> getjComboBoxMjeseci() {
        return jComboBoxMjeseci;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public static JTextField getjTextFieldDanasnjiDatum() {
        return jTextFieldDanasnjiDatum;
    }

    public static JPanel getjPanePrognoza() {
        return jPanePrognoza;
    }

    public static JPanel getjPanelDanas() {
        return jPanelDanas;
    }
}
