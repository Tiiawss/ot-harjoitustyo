/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

/**
 *
 * @author nytiia
 */
import java.awt.Color;
import java.text.DecimalFormat;


public class calculator extends javax.swing.JFrame {
    
    
                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDivideX;
    private javax.swing.JButton bntClearLast;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTimes;
    private javax.swing.JButton btnComma;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPower2;
    private javax.swing.JButton btnPrecent;
    private javax.swing.JButton btnPlusAndMinus;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnPlus;
    private javax.swing.JLabel txtBeginning;
    private javax.swing.JLabel txtHistori;
             


    public calculator() {
        initComponents();
        
    }
    
  
                     
    private void initComponents() {
        
        
        //numbers
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton(); 
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        
        
        
        //Action buttons
        btnPlusAndMinus = new javax.swing.JButton();
        btnComma = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();       
        btnClearAll = new javax.swing.JButton();
        btnPrecent = new javax.swing.JButton();                  
        bntClearLast = new javax.swing.JButton();
        btnSquare = new javax.swing.JButton();                   
        btnDelete = new javax.swing.JButton();
        btnPower2 = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnTimes = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnDivideX = new javax.swing.JButton();
        

        
        //labels
        txtBeginning = new javax.swing.JLabel();
        txtHistori = new javax.swing.JLabel();

        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(100, 100, 100));
        setBackground(Color.yellow);
       
        
      

        
        //Numbers set actions
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn0.setBackground(Color.pink);
        btn0.setPreferredSize(new java.awt.Dimension(80, 40));
        btn0.addActionListener((java.awt.event.ActionEvent e) -> {
            btn0ActionPerformed(e);
        });
        
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn1.setBackground(Color.pink);
        btn1.setPreferredSize(new java.awt.Dimension(80, 40));
        btn1.addActionListener((java.awt.event.ActionEvent e) -> {
            btn1ActionPerformed(e);
        });
        
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn2.setBackground(Color.pink);
        btn2.setPreferredSize(new java.awt.Dimension(80, 40));
        btn2.addActionListener((java.awt.event.ActionEvent e) -> {
            btn2ActionPerformed(e);
        });
        
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn3.setBackground(Color.pink);
        btn3.setPreferredSize(new java.awt.Dimension(80, 40));
        btn3.addActionListener((java.awt.event.ActionEvent e) -> {
            btn3ActionPerformed(e);
        });
        
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn4.setBackground(Color.pink);
        btn4.setPreferredSize(new java.awt.Dimension(80, 40));
        btn4.addActionListener((java.awt.event.ActionEvent e) -> {
            btn4ActionPerformed(e);
        });
        
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn5.setBackground(Color.pink);
        btn5.setPreferredSize(new java.awt.Dimension(80, 40));
        btn5.addActionListener((java.awt.event.ActionEvent e) -> {
            btn5ActionPerformed(e);
        });
           
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn6.setBackground(Color.pink);
        btn6.setPreferredSize(new java.awt.Dimension(80, 40));
        btn6.addActionListener((java.awt.event.ActionEvent e) -> {
            btn6ActionPerformed(e);
        });

        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn7.setBackground(Color.pink);
        btn7.setPreferredSize(new java.awt.Dimension(80, 40));
        btn7.addActionListener((java.awt.event.ActionEvent e) -> {
            btn7ActionPerformed(e);
        });
        
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn8.setBackground(Color.pink);
        btn8.setPreferredSize(new java.awt.Dimension(80, 40));
        btn8.addActionListener((java.awt.event.ActionEvent e) -> {
            btn8ActionPerformed(e);
        });

        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btn9.setBackground(Color.pink);
        btn9.setPreferredSize(new java.awt.Dimension(80, 40));
        btn9.addActionListener((java.awt.event.ActionEvent e) -> {
            btn9ActionPerformed(e);
        });
        
        
        //Actionbuttons
        btnPlusAndMinus.setText("±");
        btnPlusAndMinus.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnPlusAndMinus.setBackground(Color.green);
        btnPlusAndMinus.setPreferredSize(new java.awt.Dimension(80, 40));
        btnPlusAndMinus.addActionListener((java.awt.event.ActionEvent e) -> {
            btnPlusMinusActionPerformed(e);
        });

        

        btnComma.setText(".");
        btnComma.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnComma.setBackground(Color.green);
        btnComma.setPreferredSize(new java.awt.Dimension(80, 40));
        btnComma.addActionListener((java.awt.event.ActionEvent e) -> {
            btnKomaActionPerformed(e);
        });

        btnEqual.setText("=");
        btnEqual.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnEqual.setBackground(Color.green);
        btnEqual.setPreferredSize(new java.awt.Dimension(80, 40));
        btnEqual.addActionListener((java.awt.event.ActionEvent e) -> {
            btnEqualActionPerformed(e);
        });

      

        btnClearAll.setText("CE");
        btnClearAll.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnClearAll.setBackground(Color.green);
        btnClearAll.setPreferredSize(new java.awt.Dimension(80, 40));
        btnClearAll.addActionListener((java.awt.event.ActionEvent e) -> {
            btnClearHistoriActionPerformed(e);
        });

        btnPrecent.setText("%");
        btnPrecent.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnPrecent.setBackground(Color.green);
        btnPrecent.setPreferredSize(new java.awt.Dimension(80, 40));
        btnPrecent.addActionListener((java.awt.event.ActionEvent e) -> {
            btnPersenActionPerformed(e);
        });

        

        
        bntClearLast.setText("C");
        bntClearLast.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        bntClearLast.setBackground(Color.green);
        bntClearLast.setPreferredSize(new java.awt.Dimension(80, 40));
        bntClearLast.addActionListener((java.awt.event.ActionEvent e) -> {
            btnClearActionPerformed(e);
        });

        btnSquare.setText("√");
        btnSquare.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnSquare.setBackground(Color.green);
        btnSquare.setPreferredSize(new java.awt.Dimension(80, 40));
        btnSquare.addActionListener((java.awt.event.ActionEvent e) -> {
            btnSquareActionPerformed(e);
        });

        btnDelete.setText("DEL");
        btnDelete.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnDelete.setBackground(Color.green);
        btnDelete.setPreferredSize(new java.awt.Dimension(80, 40));
        btnDelete.addActionListener((java.awt.event.ActionEvent e) -> {
            btnDeleteActionPerformed(e);
        });

        btnPower2.setText("x^2");
        btnPower2.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnPower2.setBackground(Color.green);
        btnPower2.setPreferredSize(new java.awt.Dimension(80, 40));
        btnPower2.addActionListener((java.awt.event.ActionEvent e) -> {
            btnPower2ActionPerformed(e);
        });

        btnPlus.setText("+");
        btnPlus.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnPlus.setBackground(Color.green);
        btnPlus.setPreferredSize(new java.awt.Dimension(80, 40));
        btnPlus.addActionListener((java.awt.event.ActionEvent e) -> {
            btnPlusActionPerformed(e);
        });

        btnMinus.setText("─");
        btnMinus.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnMinus.setBackground(Color.green);
        btnMinus.setPreferredSize(new java.awt.Dimension(80, 40));
        btnMinus.addActionListener((java.awt.event.ActionEvent e) -> {
            btnMinusActionPerformed(e);
        });

        btnTimes.setText("×");
        btnTimes.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnTimes.setBackground(Color.green);
        btnTimes.setPreferredSize(new java.awt.Dimension(80, 40));
        btnTimes.addActionListener((java.awt.event.ActionEvent e) -> {
            btnMultiActionPerformed(e);
        });

        btnDivide.setText("÷");
        btnDivide.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnDivide.setBackground(Color.green);
        btnDivide.setPreferredSize(new java.awt.Dimension(80, 41));
        btnDivide.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnDivideActionPerformed(evt);
        });

        btnDivideX.setText("1/x");
        btnDivideX.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        btnDivideX.setBackground(Color.green);
        btnDivideX.setPreferredSize(new java.awt.Dimension(80, 41));
        btnDivideX.addActionListener((java.awt.event.ActionEvent e) -> {
            btnDividexActionPerformed(e);
        });
        
        
        //current happenings
        txtBeginning.setFont(new java.awt.Font("Times", 0, 38)); 
        txtBeginning.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtBeginning.setText("0");
        //history
        txtHistori.setFont(new java.awt.Font("Times", 0, 16)); 
        txtHistori.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHistori.setPreferredSize(new java.awt.Dimension(0, 20));

        
        
        javax.swing.GroupLayout layout;
        layout = new javax.swing.GroupLayout(getContentPane());
        
        getContentPane().setLayout(layout);
        //layout add buttons
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    
                .addContainerGap()
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPrecent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClearAll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bntClearLast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSquare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPower2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDivideX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    
                                .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnPlusAndMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEqual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, Short.MAX_VALUE))
                        
                    .addComponent(txtBeginning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHistori, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        
     
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtHistori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBeginning, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPrecent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPower2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivideX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntClearLast, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPlusAndMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );


        pack();
    }                     

    
    
    
   
    double score;
    String mark = "";
      
    
   
    public void number(String a){
        if(txtBeginning.getText().equals("0")){
            txtBeginning.setText(a);
        }else{
            txtBeginning.setText(txtBeginning.getText()+a);
        }
      
    }
    

    public void setScore(double a){
        score = a;
    }
    

    public String removeComma(double a){
        String result;
        DecimalFormat dF = new DecimalFormat("###.#");
        result = dF.format(a);
        return result;
    }
    
  
    public boolean ChekValueOk(){
        boolean result;
        result = !mark.equals("");
        return result;
    }
    
    public void calculateValue(){
        switch (mark) {
            case "+":
                score = score+Double.parseDouble(txtBeginning.getText());
                break;
            case "-":
                score = score-Double.parseDouble(txtBeginning.getText());
                break;
            case "*":
                score = score*Double.parseDouble(txtBeginning.getText());
                break;
            case "/":
                score = score/Double.parseDouble(txtBeginning.getText());
                break;
            default:
                break;
        }
    }
    
    
  
   
   //Numbers 
    
    private void btn0ActionPerformed(java.awt.event.ActionEvent e) {                                     
      number("0");
   }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("1");
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("9");
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("3");
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("4");
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("5");
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("6");
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("7");
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("8");
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent e) {                                     
        number("2");
    }                                    

    
    
    
    //Actions
    private void btnClearHistoriActionPerformed(java.awt.event.ActionEvent e) {                                                
        txtHistori.setText("");
    }                                               


    private void btnClearActionPerformed(java.awt.event.ActionEvent e) {                                         
        txtHistori.setText("");
        txtBeginning.setText("0");
        score = 0;
    }                                        

    
    private void btnPlusActionPerformed(java.awt.event.ActionEvent e) {                                          
        if(ChekValueOk()){
            calculateValue();
        }else{
            setScore(Double.parseDouble(txtBeginning.getText()));
        }
        
        mark = "+";
        txtHistori.setText(removeComma(score)+mark);
        txtBeginning.setText("0");
    }                                         

    private void btnMinusActionPerformed(java.awt.event.ActionEvent e) {                                          
        if(ChekValueOk()){
            calculateValue();
        }else{
            setScore(Double.parseDouble(txtBeginning.getText()));
        }
        
        mark = "-";
        txtHistori.setText(removeComma(score)+mark);
        txtBeginning.setText("0");
    }                                         

    private void btnMultiActionPerformed(java.awt.event.ActionEvent e) {                                        
        if(ChekValueOk()){
            calculateValue();
        }else{
            setScore(Double.parseDouble(txtBeginning.getText()));
        }
        
        mark = "*";
        txtHistori.setText(removeComma(score)+"x");
        txtBeginning.setText("0");
    }                                       

    private void btnDivideActionPerformed(java.awt.event.ActionEvent e) {                                        
        if(ChekValueOk()){
            calculateValue();
        }else{
            setScore(Double.parseDouble(txtBeginning.getText()));
        }
        
        mark = "/";
        txtHistori.setText(removeComma(score)+"÷");
        txtBeginning.setText("0");
    }                                       

    private void btnDividexActionPerformed(java.awt.event.ActionEvent e) {                                         
        score = Double.parseDouble(txtBeginning.getText());
        score = 1/score;
        txtBeginning.setText(removeComma(score));
    }                                        

    private void btnPower2ActionPerformed(java.awt.event.ActionEvent e) {                                            
        score = Double.parseDouble(txtBeginning.getText());
        score = score*score;
        txtBeginning.setText(removeComma(score));
        txtHistori.setText("");
    }                                           

    private void btnSquareActionPerformed(java.awt.event.ActionEvent e) {                                        
        score = Double.parseDouble(txtBeginning.getText());
        score = Math.sqrt(score);
        txtBeginning.setText(removeComma(score));
        txtHistori.setText("");
    }                                       

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent e) {                                       
        if(txtBeginning.getText().length() > 1){
            StringBuffer var;
            var = new StringBuffer(txtBeginning.getText());
            var = var.deleteCharAt(txtBeginning.getText().length()-1);
            txtBeginning.setText(String.valueOf(var));
            setScore(Double.parseDouble(String.valueOf(var)));
        }else{
            number("0");
        }
    }                                      

    
    private void btnEqualActionPerformed(java.awt.event.ActionEvent e) {                                              
        if(ChekValueOk()){
            calculateValue();
            mark = "";
            txtHistori.setText(txtHistori.getText()+txtBeginning.getText());
            txtBeginning.setText(removeComma(score));
        }
    }                                             

   
    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent e) {                                             
        double a = Double.parseDouble(txtBeginning.getText());
        if(a<0){
            a = a+(a*-2);
            setScore(a);
            txtBeginning.setText(removeComma(score));
        }else{
            a = a-(a+a);
            setScore(a);
            txtBeginning.setText(removeComma(score));
        }
    }                                            


    private void btnKomaActionPerformed(java.awt.event.ActionEvent e) {                                        
        txtBeginning.setText(txtBeginning.getText()+".");
    }                                       

    private void btnPersenActionPerformed(java.awt.event.ActionEvent e) {                                          
        txtHistori.setText(txtBeginning.getText()+"÷100");
        score = Double.parseDouble(txtBeginning.getText())/100;
        txtBeginning.setText(removeComma(score));
    }                                         

   
    
    //Mainclass starts
    public static void main(String args[]) {
      
       
        java.awt.EventQueue.invokeLater(() -> {
            new calculator().setVisible(true);
        });
    }

                   
   
}
