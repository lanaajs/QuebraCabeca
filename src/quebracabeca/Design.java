package quebracabeca;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.Arrays;
import java.util.List;

public class Design extends javax.swing.JFrame 
{
    static int milisegundo=0;
    static int segundo=0;
    static int minuto=0;
    static int hora=0;
    
    static boolean state = true;

    static int contagem=0;
    
    Movimentacao movebutton = new Movimentacao();
    
    public Design() 
    {
        initComponents(); 
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hora2 = new javax.swing.JLabel();
        bum = new javax.swing.JButton();
        bdois = new javax.swing.JButton();
        btres = new javax.swing.JButton();
        bquatro = new javax.swing.JButton();
        bcinco = new javax.swing.JButton();
        bseis = new javax.swing.JButton();
        bsete = new javax.swing.JButton();
        boito = new javax.swing.JButton();
        bnove = new javax.swing.JButton();
        btreze = new javax.swing.JButton();
        bdez = new javax.swing.JButton();
        bonze = new javax.swing.JButton();
        bdoze = new javax.swing.JButton();
        bquatorze = new javax.swing.JButton();
        bdezesseis = new javax.swing.JButton();
        bquinze = new javax.swing.JButton();
        Hora = new javax.swing.JLabel();
        Minuto = new javax.swing.JLabel();
        Milisegundo = new javax.swing.JLabel();
        Segundo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pontos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Hora2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        Hora2.setText("00:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quebra-Cabeça");
        setBackground(new java.awt.Color(0, 0, 0));

        bum.setBackground(new java.awt.Color(0, 204, 204));
        bum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bum.setForeground(new java.awt.Color(255, 255, 255));
        bum.setText("1");
        bum.setName("bum"); // NOI18N
        bum.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bumMouseDragged(evt);
            }
        });
        bum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bumActionPerformed(evt);
            }
        });

        bdois.setBackground(new java.awt.Color(0, 204, 204));
        bdois.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bdois.setForeground(new java.awt.Color(255, 255, 255));
        bdois.setText("2");
        bdois.setName("bdois"); // NOI18N
        bdois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdoisActionPerformed(evt);
            }
        });

        btres.setBackground(new java.awt.Color(0, 204, 204));
        btres.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btres.setForeground(new java.awt.Color(255, 255, 255));
        btres.setText("3");
        btres.setName("btres"); // NOI18N
        btres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresActionPerformed(evt);
            }
        });

        bquatro.setBackground(new java.awt.Color(0, 204, 204));
        bquatro.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bquatro.setForeground(new java.awt.Color(255, 255, 255));
        bquatro.setText("4");
        bquatro.setName("bquatro"); // NOI18N
        bquatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatroActionPerformed(evt);
            }
        });

        bcinco.setBackground(new java.awt.Color(0, 204, 204));
        bcinco.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bcinco.setForeground(new java.awt.Color(255, 255, 255));
        bcinco.setText("5");
        bcinco.setName("bcinco"); // NOI18N
        bcinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcincoActionPerformed(evt);
            }
        });

        bseis.setBackground(new java.awt.Color(0, 204, 204));
        bseis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bseis.setForeground(new java.awt.Color(255, 255, 255));
        bseis.setText("6");
        bseis.setName("bseis"); // NOI18N
        bseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseisActionPerformed(evt);
            }
        });

        bsete.setBackground(new java.awt.Color(0, 204, 204));
        bsete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bsete.setForeground(new java.awt.Color(255, 255, 255));
        bsete.setText("7");
        bsete.setName("bsete"); // NOI18N
        bsete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bseteActionPerformed(evt);
            }
        });

        boito.setBackground(new java.awt.Color(0, 204, 204));
        boito.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        boito.setForeground(new java.awt.Color(255, 255, 255));
        boito.setText("8");
        boito.setName("boito"); // NOI18N
        boito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boitoActionPerformed(evt);
            }
        });

        bnove.setBackground(new java.awt.Color(0, 204, 204));
        bnove.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bnove.setForeground(new java.awt.Color(255, 255, 255));
        bnove.setText("9");
        bnove.setName("bnove"); // NOI18N
        bnove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnoveActionPerformed(evt);
            }
        });

        btreze.setBackground(new java.awt.Color(0, 204, 204));
        btreze.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btreze.setForeground(new java.awt.Color(255, 255, 255));
        btreze.setText("13");
        btreze.setName("btreze"); // NOI18N
        btreze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrezeActionPerformed(evt);
            }
        });

        bdez.setBackground(new java.awt.Color(0, 204, 204));
        bdez.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bdez.setForeground(new java.awt.Color(255, 255, 255));
        bdez.setText("10");
        bdez.setName("bdez"); // NOI18N
        bdez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezActionPerformed(evt);
            }
        });

        bonze.setBackground(new java.awt.Color(0, 204, 204));
        bonze.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bonze.setForeground(new java.awt.Color(255, 255, 255));
        bonze.setText("11");
        bonze.setName("bonze"); // NOI18N
        bonze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonzeActionPerformed(evt);
            }
        });

        bdoze.setBackground(new java.awt.Color(0, 204, 204));
        bdoze.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bdoze.setForeground(new java.awt.Color(255, 255, 255));
        bdoze.setText("12");
        bdoze.setName("bdoze"); // NOI18N
        bdoze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdozeActionPerformed(evt);
            }
        });

        bquatorze.setBackground(new java.awt.Color(0, 204, 204));
        bquatorze.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bquatorze.setForeground(new java.awt.Color(255, 255, 255));
        bquatorze.setText("14");
        bquatorze.setName("bquatorze"); // NOI18N
        bquatorze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquatorzeActionPerformed(evt);
            }
        });

        bdezesseis.setBackground(new java.awt.Color(0, 204, 204));
        bdezesseis.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bdezesseis.setForeground(new java.awt.Color(255, 255, 255));
        bdezesseis.setText("15");
        bdezesseis.setName("bdezesseis"); // NOI18N
        bdezesseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdezesseisActionPerformed(evt);
            }
        });

        bquinze.setBackground(new java.awt.Color(0, 204, 204));
        bquinze.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        bquinze.setForeground(new java.awt.Color(255, 255, 255));
        bquinze.setName("bquinze"); // NOI18N
        bquinze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bquinzeActionPerformed(evt);
            }
        });

        Hora.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        Hora.setForeground(new java.awt.Color(0, 153, 153));
        Hora.setText("00:");

        Minuto.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        Minuto.setForeground(new java.awt.Color(0, 153, 153));
        Minuto.setText("00:");

        Milisegundo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        Milisegundo.setForeground(new java.awt.Color(0, 153, 153));
        Milisegundo.setText("00");

        Segundo.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        Segundo.setForeground(new java.awt.Color(0, 153, 153));
        Segundo.setText("00:");

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Timer:");

        Pontos.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 20)); // NOI18N
        Pontos.setForeground(new java.awt.Color(0, 153, 153));
        Pontos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pontos.setText("0");
        Pontos.setName("Pontos"); // NOI18N

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Jogadas:");

        jLabel3.setFont(new java.awt.Font("Poor Richard", 1, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("QUEBRA CABEÇA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Segundo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Milisegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bnove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bcinco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btreze, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bquatorze, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdois, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdez, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bsete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(bonze, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bquinze, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bquatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bdoze, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(bdezesseis, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bquatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdois, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bsete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boito, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bdoze, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bonze, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bdezesseis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btreze, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bquinze, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bquatorze, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bcinco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnove, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pontos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hora)
                    .addComponent(Minuto)
                    .addComponent(Milisegundo)
                    .addComponent(Segundo)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bdezesseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdezesseisActionPerformed
        // TODO add your handling code here: 
        movebutton.mover(bdezesseis, bdoze, bquinze);
        List<String> lista= Arrays.asList(bum.getText(), bdois.getText(), btres.getText(), bquatro.getText(), bcinco.getText(), bseis.getText(), bsete.getText(), boito.getText(), bnove.getText(), bdez.getText(), bonze.getText(), bdoze.getText(), btreze.getText(), bquatorze.getText(), bquinze.getText(), bdezesseis.getText());
        movebutton.condicao(lista, bum, bdois, btres, bquatro, bcinco, bseis, bsete, boito, bnove, bdez, bonze, bdoze, btreze, bquatorze, bquinze, bdezesseis, Milisegundo, Segundo, Minuto, Hora, Pontos);
        
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bdezesseisActionPerformed

    private void bumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bumActionPerformed
        // TODO add your handling code here:
        movebutton.mover(bum,bdois,bcinco);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bumActionPerformed

    private void bquatorzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquatorzeActionPerformed
        // TODO add your handling code here:
        movebutton.mover(bquatorze, bdez, btreze, bquinze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bquatorzeActionPerformed

    private void bdoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdoisActionPerformed
        movebutton.mover(bdois, bum, btres, bseis);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bdoisActionPerformed

    private void btresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresActionPerformed
        movebutton.mover(btres, bdois, bquatro, bsete);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_btresActionPerformed

    private void bquatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquatroActionPerformed
        movebutton.mover(bquatro, btres, boito);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bquatroActionPerformed

    private void bcincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcincoActionPerformed
        movebutton.mover(bcinco, bum, bseis, bnove);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bcincoActionPerformed

    private void bseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bseisActionPerformed
        movebutton.mover(bseis, bcinco, bdois, bsete, bdez);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bseisActionPerformed

    private void bseteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bseteActionPerformed
        movebutton.mover(bsete, btres, bseis, boito, bonze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bseteActionPerformed

    private void boitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boitoActionPerformed
         movebutton.mover(boito, bquatro, bsete, bdoze);
         
         contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_boitoActionPerformed

    private void bnoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnoveActionPerformed
        movebutton.mover(bnove, bcinco, bdez, btreze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bnoveActionPerformed

    private void bdezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdezActionPerformed
        movebutton.mover(bdez, bseis, bnove, bonze, bquatorze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bdezActionPerformed

    private void bonzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonzeActionPerformed
        movebutton.mover(bonze, bsete, bdez, bdoze, bquinze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bonzeActionPerformed

    private void bdozeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdozeActionPerformed
        movebutton.mover(bdoze, boito, bonze, bdezesseis);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bdozeActionPerformed

    private void btrezeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrezeActionPerformed
        movebutton.mover(btreze, bnove, bquatorze);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_btrezeActionPerformed

    private void bquinzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bquinzeActionPerformed
        movebutton.mover(bquinze, bonze, bquatorze, bdezesseis);
        
        contagem++;  
        movebutton.conta(Pontos, contagem);
        tempo();
    }//GEN-LAST:event_bquinzeActionPerformed

    private void bumMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bumMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_bumMouseDragged

    public void tempo(){
        Thread t = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    if(state==true)
                    {
                        try
                        { 
                            if(contagem==0)
                            {
                                milisegundo=0;
                                segundo=0;
                                minuto=0;
                                hora=0;
                                
                                Milisegundo.setText("00");
                                Segundo.setText("00:");
                                Minuto.setText("00:");
                                Hora.setText("00:"); 
                            }
                            
                            sleep(1);                                                
                          
                            if(milisegundo>1000)
                            {
                                milisegundo=0;
                                segundo++;
                            }

                            if(segundo>59)
                            {
                                milisegundo=0;
                                segundo=0;
                                minuto++;
                            }

                            if(minuto>59)
                            {
                                milisegundo=0;
                                segundo=0;
                                minuto=0;
                                hora++;
                            }

                            String ML= Integer.toString(milisegundo);
                            String SEG= Integer.toString(segundo);
                            String MIN= Integer.toString(minuto);
                            String HR= Integer.toString(hora);

                            Milisegundo.setText(ML);

                            milisegundo++;
                            Segundo.setText(SEG+" : ");
                            Minuto.setText(MIN+" : ");
                            Hora.setText(HR+" : ");
                          
                        }
                        catch(Exception e)
                        {
                          
                        }
                    }
                    else
                    {
                        break;
                    } 
                }
            }
        };
        
        t.start();
    }                               
     
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Design().setVisible(true);
            } 
            
        });
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Hora2;
    private javax.swing.JLabel Milisegundo;
    private javax.swing.JLabel Minuto;
    private javax.swing.JLabel Pontos;
    private javax.swing.JLabel Segundo;
    private javax.swing.JButton bcinco;
    private javax.swing.JButton bdez;
    private javax.swing.JButton bdezesseis;
    private javax.swing.JButton bdois;
    private javax.swing.JButton bdoze;
    private javax.swing.JButton bnove;
    private javax.swing.JButton boito;
    private javax.swing.JButton bonze;
    private javax.swing.JButton bquatorze;
    private javax.swing.JButton bquatro;
    private javax.swing.JButton bquinze;
    private javax.swing.JButton bseis;
    private javax.swing.JButton bsete;
    private javax.swing.JButton btres;
    private javax.swing.JButton btreze;
    private javax.swing.JButton bum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
   
}

