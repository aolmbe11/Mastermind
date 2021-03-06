package mastermind;

import java.awt.Toolkit;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

public class Main extends javax.swing.JFrame {

    //Declaración de variables y constantes;
    final byte BOLA_VERDE = 0;
    final byte BOLA_AMARILLA = 1;
    final byte BOLA_AZUL = 2;
    final byte BOLA_ROJA = 3;
    final byte BOLA_TURQUESA = 4;
    final byte BOLA_MARRON = 5;
    final byte BOLA_MORADA = 6;
    final byte BOLA_NEGRA = 7;
    final byte BOLA_BLANCA = 8;
    final byte BOLA_GRIS = 9;

    final byte LONGITUD_PASSWORD = 4;

    byte nivel;

    Random generaNum = new Random();

    byte fila;
    byte columna;
    String stringFilaColumna = "";
    byte filaColumna;

    String combinacionInicial = "";
    String combinacionUsuario = "";

    String posicionColumna;
    char numColumna;

    byte filaColumnaResultado = 10;

    String instrucciones = "\n  Instrucciones \n============\n\n"
            + "1. Debe elegir un nivel de dificultad, que dependerá de"
            + " la cantidad de colores a acertar (4,5,6 o 7).\n\n * Niveles Fácil y Medio:\n"
            + "Los fallos o aciertos se mostrarán en el panel derecho, en el mismo orden de la combinación."
            + "\n\nAparecerá, al comprobar cada fila, una bola blanca si el color elegido es el correcto, "
            + "una bola negra si no es su lugar adecuado o una bola gris si el color no es correcto."
            + "\n\n * Niveles Difícil y Experto:\nLos resultados se mostrarán desordenados.\n\n"
            + "Aparecerá, al comprobar cada fila, una bola blanca si hay algún color de los elegidos "
            + "que exista en la combinación ganadora y está en la posición correcta.\n\nUna bola "
            + "negra si no está en la posición correcta, pero existe en la combinación ganadora."
            + "\n\nO bien, una bola gris si el color no existe en la combinación ganadora."
            + "\n\n2. Tras elegir una combinación de 4 colores, pulsar Comproba Fila.\n\n3. Puede"
            + "reiniciar la partida, en cualquier momento, pulsando Nueva Partida.";

    String creditos = "\n  Créditos \n============\n\n"
            + "- Desarrollador:\n\n Ángel Olmedo Benítez.\n\n"
            + "- Imágenes bolas:\n\n www.openclipart.com - uploader: esiscd2000.\n\n"
            + "- Imagen you win:\n\n www.bostondigital.com.au.\n\n"
            + "- Imagen game over:\n\n www.gopixpic.com.\n\n"
            + "- Sonido you win:\n\n Mike Koenig.\n\n"
            + "- Sonido you lose:\n\n Joe Lamb.";

    public Main() {
        initComponents();

        // Centrar ventana en la pantalla.
        setLocationRelativeTo(null);
        
        // Método que cambia el icono.
        setIcono();

        ImageIcon imagenLogo = new ImageIcon(getClass().getResource("/mastermind/imagenes/logo.png"));
        etiquetaLogo.setIcon(imagenLogo);

        // Desabilitar botones al iniciar la pantalla.
        botonLeyenda.setEnabled(false);
        botonComprobar.setEnabled(false);
        jComboBox1.setEnabled(false);
        botonBola0.setEnabled(false);
        botonBola1.setEnabled(false);
        botonBola2.setEnabled(false);
        botonBola3.setEnabled(false);
        botonBola4.setEnabled(false);
        botonBola5.setEnabled(false);
        botonBola6.setEnabled(false);

        // Mostrar instrucciones y adptar texto al TextArea.
        textAreaInstrucciones.setText(instrucciones);
        textAreaInstrucciones.setLineWrap(true);
        textAreaInstrucciones.setWrapStyleWord(true);
        textAreaInstrucciones.setEditable(false);

        fila = 1;
        columna = 1;
        stringFilaColumna += fila;
        stringFilaColumna += columna;
        filaColumna = Byte.valueOf(stringFilaColumna);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAreaInstrucciones = new javax.swing.JTextArea();
        etiquetaLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonBola2 = new javax.swing.JButton();
        botonBola0 = new javax.swing.JButton();
        botonBola3 = new javax.swing.JButton();
        botonBola1 = new javax.swing.JButton();
        botonBola5 = new javax.swing.JButton();
        botonBola4 = new javax.swing.JButton();
        botonBola6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        bolaGris1_2 = new javax.swing.JLabel();
        bolaGris1_3 = new javax.swing.JLabel();
        bolaGris1_4 = new javax.swing.JLabel();
        bolaGris1_1 = new javax.swing.JLabel();
        bolaGris2_1 = new javax.swing.JLabel();
        bolaGris2_2 = new javax.swing.JLabel();
        bolaGris2_3 = new javax.swing.JLabel();
        bolaGris2_4 = new javax.swing.JLabel();
        bolaGris3_2 = new javax.swing.JLabel();
        bolaGris3_3 = new javax.swing.JLabel();
        bolaGris3_4 = new javax.swing.JLabel();
        bolaGris3_1 = new javax.swing.JLabel();
        bolaGris4_3 = new javax.swing.JLabel();
        bolaGris4_1 = new javax.swing.JLabel();
        bolaGris4_4 = new javax.swing.JLabel();
        bolaGris4_2 = new javax.swing.JLabel();
        bolaGris5_4 = new javax.swing.JLabel();
        bolaGris5_2 = new javax.swing.JLabel();
        bolaGris5_3 = new javax.swing.JLabel();
        bolaGris5_1 = new javax.swing.JLabel();
        bolaGris6_1 = new javax.swing.JLabel();
        bolaGris6_3 = new javax.swing.JLabel();
        bolaGris6_4 = new javax.swing.JLabel();
        bolaGris6_2 = new javax.swing.JLabel();
        bolaGris7_4 = new javax.swing.JLabel();
        bolaGris7_3 = new javax.swing.JLabel();
        bolaGris7_1 = new javax.swing.JLabel();
        bolaGris7_2 = new javax.swing.JLabel();
        bolaGris8_1 = new javax.swing.JLabel();
        bolaGris8_4 = new javax.swing.JLabel();
        bolaGris8_2 = new javax.swing.JLabel();
        bolaGris8_3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        etiquetaAcierto8_1 = new javax.swing.JLabel();
        etiquetaAcierto8_2 = new javax.swing.JLabel();
        etiquetaAcierto8_3 = new javax.swing.JLabel();
        etiquetaAcierto8_4 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        etiquetaAcierto7_1 = new javax.swing.JLabel();
        etiquetaAcierto7_2 = new javax.swing.JLabel();
        etiquetaAcierto7_3 = new javax.swing.JLabel();
        etiquetaAcierto7_4 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        etiquetaAcierto6_1 = new javax.swing.JLabel();
        etiquetaAcierto6_2 = new javax.swing.JLabel();
        etiquetaAcierto6_3 = new javax.swing.JLabel();
        etiquetaAcierto6_4 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        etiquetaAcierto5_1 = new javax.swing.JLabel();
        etiquetaAcierto5_2 = new javax.swing.JLabel();
        etiquetaAcierto5_3 = new javax.swing.JLabel();
        etiquetaAcierto5_4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        etiquetaAcierto4_1 = new javax.swing.JLabel();
        etiquetaAcierto4_2 = new javax.swing.JLabel();
        etiquetaAcierto4_3 = new javax.swing.JLabel();
        etiquetaAcierto4_4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        etiquetaAcierto3_1 = new javax.swing.JLabel();
        etiquetaAcierto3_2 = new javax.swing.JLabel();
        etiquetaAcierto3_3 = new javax.swing.JLabel();
        etiquetaAcierto3_4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        etiquetaAcierto2_1 = new javax.swing.JLabel();
        etiquetaAcierto2_2 = new javax.swing.JLabel();
        etiquetaAcierto2_3 = new javax.swing.JLabel();
        etiquetaAcierto2_4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        etiquetaAcierto1_1 = new javax.swing.JLabel();
        etiquetaAcierto1_2 = new javax.swing.JLabel();
        etiquetaAcierto1_3 = new javax.swing.JLabel();
        etiquetaAcierto1_4 = new javax.swing.JLabel();
        botonComprobar = new javax.swing.JButton();
        botonNuevaPartida = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        botonLeyenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(151, 158, 175));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaInstrucciones.setColumns(20);
        textAreaInstrucciones.setRows(5);
        textAreaInstrucciones.setOpaque(false);
        getContentPane().add(textAreaInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 400, 550));
        getContentPane().add(etiquetaLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 420, 140));

        jPanel1.setBackground(new java.awt.Color(150, 155, 162));

        botonBola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAzul2.png"))); // NOI18N
        botonBola2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola2ActionPerformed(evt);
            }
        });

        botonBola0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaVerde.png"))); // NOI18N
        botonBola0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola0ActionPerformed(evt);
            }
        });

        botonBola3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaRoja.png"))); // NOI18N
        botonBola3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola3ActionPerformed(evt);
            }
        });

        botonBola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAmarilla.png"))); // NOI18N
        botonBola1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola1ActionPerformed(evt);
            }
        });

        botonBola5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaMarron.png"))); // NOI18N
        botonBola5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola5ActionPerformed(evt);
            }
        });

        botonBola4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAzulita.png"))); // NOI18N
        botonBola4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola4ActionPerformed(evt);
            }
        });

        botonBola6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaMorada.png"))); // NOI18N
        botonBola6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBola6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(botonBola0)
                .addGap(18, 18, 18)
                .addComponent(botonBola1)
                .addGap(18, 18, 18)
                .addComponent(botonBola2)
                .addGap(18, 18, 18)
                .addComponent(botonBola3)
                .addGap(18, 18, 18)
                .addComponent(botonBola4)
                .addGap(18, 18, 18)
                .addComponent(botonBola5)
                .addGap(18, 18, 18)
                .addComponent(botonBola6)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBola2)
                    .addComponent(botonBola0)
                    .addComponent(botonBola3)
                    .addComponent(botonBola1)
                    .addComponent(botonBola5)
                    .addComponent(botonBola4)
                    .addComponent(botonBola6))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 650, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        bolaGris1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris4_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris5_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris5_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris6_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris6_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris6_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris6_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris7_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris7_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris7_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris7_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris8_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris8_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris8_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        bolaGris8_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris1_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris1_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris1_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris1_4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris2_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris2_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris2_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris2_4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris3_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris3_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris3_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris3_4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris4_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris4_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris4_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris4_4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris5_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris5_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris5_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris5_4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris6_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris6_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris6_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris6_4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris7_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris7_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris7_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris7_4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(bolaGris8_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris8_2)
                                .addGap(12, 12, 12)
                                .addComponent(bolaGris8_3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bolaGris8_4)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris8_4)
                    .addComponent(bolaGris8_1)
                    .addComponent(bolaGris8_2)
                    .addComponent(bolaGris8_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris7_4)
                    .addComponent(bolaGris7_1)
                    .addComponent(bolaGris7_2)
                    .addComponent(bolaGris7_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris6_4)
                    .addComponent(bolaGris6_1)
                    .addComponent(bolaGris6_2)
                    .addComponent(bolaGris6_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris5_4)
                    .addComponent(bolaGris5_1)
                    .addComponent(bolaGris5_2)
                    .addComponent(bolaGris5_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris4_4)
                    .addComponent(bolaGris4_1)
                    .addComponent(bolaGris4_2)
                    .addComponent(bolaGris4_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris3_4)
                    .addComponent(bolaGris3_1)
                    .addComponent(bolaGris3_2)
                    .addComponent(bolaGris3_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris2_4)
                    .addComponent(bolaGris2_1)
                    .addComponent(bolaGris2_2)
                    .addComponent(bolaGris2_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bolaGris1_4)
                    .addComponent(bolaGris1_1)
                    .addComponent(bolaGris1_2)
                    .addComponent(bolaGris1_3))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 380));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        etiquetaAcierto8_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto8_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto8_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto8_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto8_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto8_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto8_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto8_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto8_2)
            .addComponent(etiquetaAcierto8_3)
            .addComponent(etiquetaAcierto8_1)
            .addComponent(etiquetaAcierto8_4)
        );

        etiquetaAcierto7_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto7_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto7_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto7_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto7_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto7_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto7_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto7_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto7_2)
            .addComponent(etiquetaAcierto7_3)
            .addComponent(etiquetaAcierto7_1)
            .addComponent(etiquetaAcierto7_4)
        );

        etiquetaAcierto6_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto6_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto6_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto6_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto6_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto6_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto6_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto6_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto6_2)
            .addComponent(etiquetaAcierto6_3)
            .addComponent(etiquetaAcierto6_1)
            .addComponent(etiquetaAcierto6_4)
        );

        etiquetaAcierto5_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto5_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto5_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto5_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto5_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto5_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto5_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto5_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto5_2)
            .addComponent(etiquetaAcierto5_3)
            .addComponent(etiquetaAcierto5_1)
            .addComponent(etiquetaAcierto5_4)
        );

        etiquetaAcierto4_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto4_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto4_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto4_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto4_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto4_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto4_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto4_2)
            .addComponent(etiquetaAcierto4_3)
            .addComponent(etiquetaAcierto4_1)
            .addComponent(etiquetaAcierto4_4)
        );

        etiquetaAcierto3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto3_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto3_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto3_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto3_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto3_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto3_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto3_2)
            .addComponent(etiquetaAcierto3_3)
            .addComponent(etiquetaAcierto3_1)
            .addComponent(etiquetaAcierto3_4)
        );

        etiquetaAcierto2_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto2_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto2_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto2_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto2_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto2_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto2_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto2_2)
            .addComponent(etiquetaAcierto2_3)
            .addComponent(etiquetaAcierto2_1)
            .addComponent(etiquetaAcierto2_4)
        );

        etiquetaAcierto1_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto1_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        etiquetaAcierto1_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(etiquetaAcierto1_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto1_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto1_3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaAcierto1_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaAcierto1_2)
            .addComponent(etiquetaAcierto1_3)
            .addComponent(etiquetaAcierto1_1)
            .addComponent(etiquetaAcierto1_4)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, 380));

        botonComprobar.setText("Comprobar Fila");
        botonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarActionPerformed(evt);
            }
        });
        getContentPane().add(botonComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        botonNuevaPartida.setText("Nueva Partida");
        botonNuevaPartida.setPreferredSize(new java.awt.Dimension(105, 23));
        botonNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevaPartidaActionPerformed(evt);
            }
        });
        getContentPane().add(botonNuevaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elige nivel", "Fácil", "Medio", "Difícil", "Experto" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(105, 23));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 110, -1));

        botonLeyenda.setText("Leyenda");
        botonLeyenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLeyendaActionPerformed(evt);
            }
        });
        getContentPane().add(botonLeyenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBola0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola0ActionPerformed

        ImageIcon imagenBolaVerde = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaVerde.png"));

        botonBola0.setEnabled(false);

        combinacionUsuario += BOLA_VERDE;
        
        // En cada uno de los botones, se incrementa la columna, para mostrar la 
        //imagen de la bola adecuada en la etiqueta adecuada.
        // La fila se incrementa al comprobar cada fila.

        switch (filaColumna) {
            // Primera fila  
            case 11:
                bolaGris1_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaVerde);
                filaColumna++;
                break;
        }

        // Convertir fila y columna a String, para comprobar que el segundo caracter
        // sea 5.
        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }

    }//GEN-LAST:event_botonBola0ActionPerformed

    private void botonBola1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola1ActionPerformed

        ImageIcon imagenBolaAmarilla = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAmarilla.png"));

        botonBola1.setEnabled(false);

        combinacionUsuario += BOLA_AMARILLA;

        switch (filaColumna) {
            // Primera Fila.    
            case 11:
                bolaGris1_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaAmarilla);
                filaColumna++;
                break;

        }

        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);

        }

    }//GEN-LAST:event_botonBola1ActionPerformed

    private void botonBola2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola2ActionPerformed

        ImageIcon imagenBolaAzul = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAzul2.png"));

        botonBola2.setEnabled(false);

        combinacionUsuario += BOLA_AZUL;

        switch (filaColumna) {
            // Primera Fila.
            case 11:
                bolaGris1_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaAzul);
                filaColumna++;
                break;
        }
        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBola2ActionPerformed

    private void botonBola3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola3ActionPerformed

        ImageIcon imagenBolaRoja = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaRoja.png"));

        botonBola3.setEnabled(false);

        combinacionUsuario += BOLA_ROJA;

        switch (filaColumna) {
            // Primera Fila.
            case 11:
                bolaGris1_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaRoja);
                filaColumna++;
                break;
        }

        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBola3ActionPerformed

    private void botonBola4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola4ActionPerformed

        ImageIcon imagenBolaTurquesa = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaAzulita.png"));

        botonBola4.setEnabled(false);

        combinacionUsuario += BOLA_TURQUESA;

        switch (filaColumna) {
            // Primera Fila.
            case 11:
                bolaGris1_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaTurquesa);
                filaColumna++;
                break;
        }
        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBola4ActionPerformed

    private void botonBola5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola5ActionPerformed

        ImageIcon imagenBolaMarron = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaMarron.png"));

        botonBola5.setEnabled(false);

        combinacionUsuario += BOLA_MARRON;

        switch (filaColumna) {
            // Primera Fila.
            case 11:
                bolaGris1_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaMarron);
                filaColumna++;
                break;
        }
        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBola5ActionPerformed

    private void botonBola6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBola6ActionPerformed

        ImageIcon imagenBolaMorada = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaMorada.png"));

        botonBola6.setEnabled(false);

        combinacionUsuario += BOLA_MORADA;

        switch (filaColumna) {
            // Primera Fila.
            case 11:
                bolaGris1_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 12:
                bolaGris1_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 13:
                bolaGris1_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 14:
                bolaGris1_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Segunda fila  
            case 21:
                bolaGris2_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 22:
                bolaGris2_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 23:
                bolaGris2_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 24:
                bolaGris2_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Tercera fila  
            case 31:
                bolaGris3_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 32:
                bolaGris3_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 33:
                bolaGris3_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 34:
                bolaGris3_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Cuarta fila  
            case 41:
                bolaGris4_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 42:
                bolaGris4_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 43:
                bolaGris4_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 44:
                bolaGris4_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Quinta fila  
            case 51:
                bolaGris5_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 52:
                bolaGris5_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 53:
                bolaGris5_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 54:
                bolaGris5_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Sexta fila  
            case 61:
                bolaGris6_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 62:
                bolaGris6_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 63:
                bolaGris6_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 64:
                bolaGris6_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Séptima fila  
            case 71:
                bolaGris7_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 72:
                bolaGris7_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 73:
                bolaGris7_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 74:
                bolaGris7_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;

            // Octava fila  
            case 81:
                bolaGris8_1.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 82:
                bolaGris8_2.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 83:
                bolaGris8_3.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
            case 84:
                bolaGris8_4.setIcon(imagenBolaMorada);
                filaColumna++;
                break;
        }
        posicionColumna = String.valueOf(filaColumna);
        numColumna = posicionColumna.charAt(1);

        if (numColumna == '5') {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(true);
        }
    }//GEN-LAST:event_botonBola6ActionPerformed

    private void botonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarActionPerformed
        
        // Activar botones dependiendo del nivel.
        switch (nivel) {
            case 1:
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                break;
            case 2:
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                break;
            case 3:
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                botonBola5.setEnabled(true);
                break;
            case 4:
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                botonBola5.setEnabled(true);
                botonBola6.setEnabled(true);
                break;
        }
        botonComprobar.setEnabled(false);

        // Controlar la derrota del usuario.
        if (fila >= 8) {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(false);
            botonNuevaPartida.setEnabled(true);
            if (combinacionUsuario.equals(combinacionInicial)) {

            } else {
                try {
                    Player player = new Player(getClass().getResourceAsStream("/mastermind/sonidos/Sad_Trombone-Joe_Lamb-665429450.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                ImageIcon imagenGameOver = new ImageIcon(getClass().getResource("/mastermind/imagenes/game-over.jpg"));
                JOptionPane.showMessageDialog(this, "Lo siento, ha perdido. ¡¡¡ Intentelo de nuevo !!!", "Game Over", JOptionPane.PLAIN_MESSAGE, imagenGameOver);

            }
            botonLeyenda.setEnabled(false);
            textAreaInstrucciones.setText(creditos);
            textAreaInstrucciones.setVisible(true);
        }

        
        System.out.println("la combinacion del usuario es " + combinacionUsuario + " combinacion ganadora: " + combinacionInicial);

        ImageIcon imagenBolaBlanca = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaBlanca.png"));
        ImageIcon imagenBolaNegra = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaNegra.png"));

        String coincidentes = "";
        // Comparar combinacion usuario con combinacion inicial.    
        for (int i = 0; i < combinacionUsuario.length(); i++) {
            boolean esCoincidente = false;
            String coincidente = String.valueOf(BOLA_GRIS);
            for (int j = 0; j < combinacionInicial.length(); j++) {
                if (combinacionUsuario.charAt(i) == combinacionInicial.charAt(j)) {
                    esCoincidente = true;
                    if (i == j) {
                        coincidente = String.valueOf(BOLA_BLANCA);
                    } else {
                        coincidente = String.valueOf(BOLA_NEGRA);
                    }
                }
            }
            coincidentes += coincidente;
        }
        // Generar resultados ordenador o desordenados dependiendo del nivel.
        System.out.println("coincidentes " + coincidentes);
        if (nivel == 1 || nivel == 2) {
            System.out.println("Coincidentes ordenado " + coincidentes);
        } else {
            if (nivel == 3 || nivel == 4) {
                coincidentes = this.burbuja(coincidentes);
                System.out.println("Coincidentes desordenado " + coincidentes);
            }
        }
        System.out.println("coincidentes 2 " + coincidentes);
        
        // Controlar la victoria del usuario.
        if (combinacionUsuario.equals(combinacionInicial)) {
            botonBola0.setEnabled(false);
            botonBola1.setEnabled(false);
            botonBola2.setEnabled(false);
            botonBola3.setEnabled(false);
            botonBola4.setEnabled(false);
            botonBola5.setEnabled(false);
            botonBola6.setEnabled(false);
            botonComprobar.setEnabled(false);
            botonNuevaPartida.setEnabled(true);
            try {
                Player player = new Player(getClass().getResourceAsStream("/mastermind/sonidos/tada.mp3"));
                player.play();
                player.close();
            } catch (Exception e) {
                System.out.println("Error al reproducir el audio");
            }
            ImageIcon imagenGameOver = new ImageIcon(getClass().getResource("/mastermind/imagenes/you-win.png"));
            JOptionPane.showMessageDialog(this, "Enhorabuena, ha ganado !!!", "¡¡ Usted Gana !!", JOptionPane.PLAIN_MESSAGE, imagenGameOver);
            botonLeyenda.setEnabled(false);
            textAreaInstrucciones.setText(creditos);
            textAreaInstrucciones.setVisible(true);
        } else {
            // Bucle para generar panel de resultados.
            for (int i = 0; i < LONGITUD_PASSWORD; i++) {

                if (fila != 1) {
                    filaColumnaResultado = (byte) (fila * 10);
                    filaColumnaResultado += i;
                }
                filaColumnaResultado++;

                switch (filaColumnaResultado) {

                    // Primera fila  
                    case 11:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto1_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto1_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        break;
                    //
                    case 12:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto1_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto1_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        //
                        break;
                    case 13:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto1_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto1_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 14:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto1_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto1_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //                       

                        break;
                    // Segunda fila  
                    case 21:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto2_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto2_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 22:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto2_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto2_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 23:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto2_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto2_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 24:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto2_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto2_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;

                    // Tercera fila  
                    case 31:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto3_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto3_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 32:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto3_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto3_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 33:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto3_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto3_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 34:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto3_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto3_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;

                    // Cuarta fila  
                    case 41:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto4_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto4_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 42:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto4_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto4_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }
                        //
                        break;
                    case 43:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto4_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto4_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 44:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto4_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto4_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;

                    // Quinta fila  
                    case 51:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto5_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto5_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 52:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto5_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto5_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 53:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto5_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto5_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 54:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto5_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto5_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;

                    // Sexta fila  
                    case 61:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto6_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto6_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 62:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto6_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto6_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 63:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto6_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto6_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 64:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto6_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto6_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;

                    // Séptima fila  
                    case 71:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto7_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto7_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 72:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto7_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto7_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 73:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto7_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto7_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 74:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto7_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto7_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;

                    // Octava fila  
                    case 81:
                        if (coincidentes.charAt(0) == '9') {

                        } else {
                            if (coincidentes.charAt(0) == '7') {
                                etiquetaAcierto8_1.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(0) == '8') {
                                    etiquetaAcierto8_1.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 82:
                        if (coincidentes.charAt(1) == '9') {

                        } else {
                            if (coincidentes.charAt(1) == '7') {
                                etiquetaAcierto8_2.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(1) == '8') {
                                    etiquetaAcierto8_2.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 83:
                        if (coincidentes.charAt(2) == '9') {

                        } else {
                            if (coincidentes.charAt(2) == '7') {
                                etiquetaAcierto8_3.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(2) == '8') {
                                    etiquetaAcierto8_3.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                    case 84:
                        if (coincidentes.charAt(3) == '9') {

                        } else {
                            if (coincidentes.charAt(3) == '7') {
                                etiquetaAcierto8_4.setIcon(imagenBolaNegra);
                            } else {
                                if (coincidentes.charAt(3) == '8') {
                                    etiquetaAcierto8_4.setIcon(imagenBolaBlanca);
                                }
                            }
                        }

                        break;
                }
            }
        }

        combinacionUsuario = "";
        fila++;
        columna = 1;
        stringFilaColumna = String.valueOf(fila);
        stringFilaColumna += columna;
        filaColumna = Byte.valueOf(stringFilaColumna);

    }//GEN-LAST:event_botonComprobarActionPerformed

    private void botonNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevaPartidaActionPerformed
        ImageIcon imagenBolaGris = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolaGris.png"));
        ImageIcon imagenBolitaGris = new ImageIcon(getClass().getResource("/mastermind/imagenes/bolitaGris.png"));
        
        // Resetear pantalla
        bolaGris1_1.setIcon(imagenBolaGris);
        bolaGris1_2.setIcon(imagenBolaGris);
        bolaGris1_3.setIcon(imagenBolaGris);
        bolaGris1_4.setIcon(imagenBolaGris);
        bolaGris2_1.setIcon(imagenBolaGris);
        bolaGris2_2.setIcon(imagenBolaGris);
        bolaGris2_3.setIcon(imagenBolaGris);
        bolaGris2_4.setIcon(imagenBolaGris);
        bolaGris3_1.setIcon(imagenBolaGris);
        bolaGris3_2.setIcon(imagenBolaGris);
        bolaGris3_3.setIcon(imagenBolaGris);
        bolaGris3_4.setIcon(imagenBolaGris);
        bolaGris4_1.setIcon(imagenBolaGris);
        bolaGris4_2.setIcon(imagenBolaGris);
        bolaGris4_3.setIcon(imagenBolaGris);
        bolaGris4_4.setIcon(imagenBolaGris);
        bolaGris5_1.setIcon(imagenBolaGris);
        bolaGris5_2.setIcon(imagenBolaGris);
        bolaGris5_3.setIcon(imagenBolaGris);
        bolaGris5_4.setIcon(imagenBolaGris);
        bolaGris6_1.setIcon(imagenBolaGris);
        bolaGris6_2.setIcon(imagenBolaGris);
        bolaGris6_3.setIcon(imagenBolaGris);
        bolaGris6_4.setIcon(imagenBolaGris);
        bolaGris7_1.setIcon(imagenBolaGris);
        bolaGris7_2.setIcon(imagenBolaGris);
        bolaGris7_3.setIcon(imagenBolaGris);
        bolaGris7_4.setIcon(imagenBolaGris);
        bolaGris8_1.setIcon(imagenBolaGris);
        bolaGris8_2.setIcon(imagenBolaGris);
        bolaGris8_3.setIcon(imagenBolaGris);
        bolaGris8_4.setIcon(imagenBolaGris);

        etiquetaAcierto1_1.setIcon(imagenBolitaGris);
        etiquetaAcierto1_2.setIcon(imagenBolitaGris);
        etiquetaAcierto1_3.setIcon(imagenBolitaGris);
        etiquetaAcierto1_4.setIcon(imagenBolitaGris);
        etiquetaAcierto2_1.setIcon(imagenBolitaGris);
        etiquetaAcierto2_2.setIcon(imagenBolitaGris);
        etiquetaAcierto2_3.setIcon(imagenBolitaGris);
        etiquetaAcierto2_4.setIcon(imagenBolitaGris);
        etiquetaAcierto3_1.setIcon(imagenBolitaGris);
        etiquetaAcierto3_2.setIcon(imagenBolitaGris);
        etiquetaAcierto3_3.setIcon(imagenBolitaGris);
        etiquetaAcierto3_4.setIcon(imagenBolitaGris);
        etiquetaAcierto4_1.setIcon(imagenBolitaGris);
        etiquetaAcierto4_2.setIcon(imagenBolitaGris);
        etiquetaAcierto4_3.setIcon(imagenBolitaGris);
        etiquetaAcierto4_4.setIcon(imagenBolitaGris);
        etiquetaAcierto5_1.setIcon(imagenBolitaGris);
        etiquetaAcierto5_2.setIcon(imagenBolitaGris);
        etiquetaAcierto5_3.setIcon(imagenBolitaGris);
        etiquetaAcierto5_4.setIcon(imagenBolitaGris);
        etiquetaAcierto6_1.setIcon(imagenBolitaGris);
        etiquetaAcierto6_2.setIcon(imagenBolitaGris);
        etiquetaAcierto6_3.setIcon(imagenBolitaGris);
        etiquetaAcierto6_4.setIcon(imagenBolitaGris);
        etiquetaAcierto7_1.setIcon(imagenBolitaGris);
        etiquetaAcierto7_2.setIcon(imagenBolitaGris);
        etiquetaAcierto7_3.setIcon(imagenBolitaGris);
        etiquetaAcierto7_4.setIcon(imagenBolitaGris);
        etiquetaAcierto8_1.setIcon(imagenBolitaGris);
        etiquetaAcierto8_2.setIcon(imagenBolitaGris);
        etiquetaAcierto8_3.setIcon(imagenBolitaGris);
        etiquetaAcierto8_4.setIcon(imagenBolitaGris);

        botonBola0.setEnabled(false);
        botonBola1.setEnabled(false);
        botonBola2.setEnabled(false);
        botonBola3.setEnabled(false);
        botonBola4.setEnabled(false);
        botonBola5.setEnabled(false);
        botonBola6.setEnabled(false);

        botonLeyenda.setEnabled(true);
        // Volver a colocar el comboBox en 0.
        jComboBox1.setSelectedIndex(0);
        jComboBox1.setEnabled(true);
        textAreaInstrucciones.setText("");
        textAreaInstrucciones.setVisible(false);

        combinacionUsuario = "";
        combinacionInicial = "";

        filaColumnaResultado = 10;
        fila = 1;
        columna = 1;
        stringFilaColumna = String.valueOf(fila);
        stringFilaColumna += columna;
        filaColumna = Byte.valueOf(stringFilaColumna);
    }//GEN-LAST:event_botonNuevaPartidaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        nivel = (byte) jComboBox1.getSelectedIndex();
        jComboBox1.setEnabled(false);
        //botonComprobar.setEnabled(true);
        //Generar contraseña dependiendo del nivel y activar botones correspondientes.
        switch (nivel) {
            case 0:
                botonBola0.setEnabled(false);
                botonBola1.setEnabled(false);
                botonBola2.setEnabled(false);
                botonBola3.setEnabled(false);
                botonBola4.setEnabled(false);
                botonBola5.setEnabled(false);
                botonBola6.setEnabled(false);
                break;
            case 1:
                combinacionInicial = "";
                do {
                    int combinacionSecreta = generaNum.nextInt(4);

                    if (combinacionInicial.indexOf(String.valueOf(combinacionSecreta)) == -1) {
                        combinacionInicial += combinacionSecreta;
                    }
                } while (combinacionInicial.length() < LONGITUD_PASSWORD);
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(false);
                botonBola5.setEnabled(false);
                botonBola6.setEnabled(false);
                System.out.println("Contraseña caso FACIL " + combinacionInicial);
                break;
            case 2:
                combinacionInicial = "";
                do {
                    int combinacionSecreta = generaNum.nextInt(5);

                    if (combinacionInicial.indexOf(String.valueOf(combinacionSecreta)) == -1) {
                        combinacionInicial += combinacionSecreta;
                    }
                } while (combinacionInicial.length() < LONGITUD_PASSWORD);
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                botonBola5.setEnabled(false);
                botonBola6.setEnabled(false);
                System.out.println("Contraseña caso MEDIO " + combinacionInicial);
                break;
            case 3:
                combinacionInicial = "";
                do {
                    int combinacionSecreta = generaNum.nextInt(6);

                    if (combinacionInicial.indexOf(String.valueOf(combinacionSecreta)) == -1) {
                        combinacionInicial += combinacionSecreta;
                    }
                } while (combinacionInicial.length() < LONGITUD_PASSWORD);
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                botonBola5.setEnabled(true);
                botonBola6.setEnabled(false);
                System.out.println("Contraseña caso DIFICIL " + combinacionInicial);
                break;
            case 4:
                combinacionInicial = "";
                do {
                    int combinacionSecreta = generaNum.nextInt(7);

                    if (combinacionInicial.indexOf(String.valueOf(combinacionSecreta)) == -1) {
                        combinacionInicial += combinacionSecreta;
                    }
                } while (combinacionInicial.length() < LONGITUD_PASSWORD);
                botonBola0.setEnabled(true);
                botonBola1.setEnabled(true);
                botonBola2.setEnabled(true);
                botonBola3.setEnabled(true);
                botonBola4.setEnabled(true);
                botonBola5.setEnabled(true);
                botonBola6.setEnabled(true);
                System.out.println("Contraseña caso EXPERTO " + combinacionInicial);
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonLeyendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLeyendaActionPerformed
        ImageIcon imagenLeyenda = new ImageIcon(getClass().getResource("/mastermind/imagenes/leyenda1.png"));
        // MOstrar leyenda.
        JOptionPane.showMessageDialog(this, null, "Leyenda", JOptionPane.PLAIN_MESSAGE, imagenLeyenda);
    }//GEN-LAST:event_botonLeyendaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bolaGris1_1;
    private javax.swing.JLabel bolaGris1_2;
    private javax.swing.JLabel bolaGris1_3;
    private javax.swing.JLabel bolaGris1_4;
    private javax.swing.JLabel bolaGris2_1;
    private javax.swing.JLabel bolaGris2_2;
    private javax.swing.JLabel bolaGris2_3;
    private javax.swing.JLabel bolaGris2_4;
    private javax.swing.JLabel bolaGris3_1;
    private javax.swing.JLabel bolaGris3_2;
    private javax.swing.JLabel bolaGris3_3;
    private javax.swing.JLabel bolaGris3_4;
    private javax.swing.JLabel bolaGris4_1;
    private javax.swing.JLabel bolaGris4_2;
    private javax.swing.JLabel bolaGris4_3;
    private javax.swing.JLabel bolaGris4_4;
    private javax.swing.JLabel bolaGris5_1;
    private javax.swing.JLabel bolaGris5_2;
    private javax.swing.JLabel bolaGris5_3;
    private javax.swing.JLabel bolaGris5_4;
    private javax.swing.JLabel bolaGris6_1;
    private javax.swing.JLabel bolaGris6_2;
    private javax.swing.JLabel bolaGris6_3;
    private javax.swing.JLabel bolaGris6_4;
    private javax.swing.JLabel bolaGris7_1;
    private javax.swing.JLabel bolaGris7_2;
    private javax.swing.JLabel bolaGris7_3;
    private javax.swing.JLabel bolaGris7_4;
    private javax.swing.JLabel bolaGris8_1;
    private javax.swing.JLabel bolaGris8_2;
    private javax.swing.JLabel bolaGris8_3;
    private javax.swing.JLabel bolaGris8_4;
    private javax.swing.JButton botonBola0;
    private javax.swing.JButton botonBola1;
    private javax.swing.JButton botonBola2;
    private javax.swing.JButton botonBola3;
    private javax.swing.JButton botonBola4;
    private javax.swing.JButton botonBola5;
    private javax.swing.JButton botonBola6;
    private javax.swing.JButton botonComprobar;
    private javax.swing.JButton botonLeyenda;
    private javax.swing.JButton botonNuevaPartida;
    private javax.swing.JLabel etiquetaAcierto1_1;
    private javax.swing.JLabel etiquetaAcierto1_2;
    private javax.swing.JLabel etiquetaAcierto1_3;
    private javax.swing.JLabel etiquetaAcierto1_4;
    private javax.swing.JLabel etiquetaAcierto2_1;
    private javax.swing.JLabel etiquetaAcierto2_2;
    private javax.swing.JLabel etiquetaAcierto2_3;
    private javax.swing.JLabel etiquetaAcierto2_4;
    private javax.swing.JLabel etiquetaAcierto3_1;
    private javax.swing.JLabel etiquetaAcierto3_2;
    private javax.swing.JLabel etiquetaAcierto3_3;
    private javax.swing.JLabel etiquetaAcierto3_4;
    private javax.swing.JLabel etiquetaAcierto4_1;
    private javax.swing.JLabel etiquetaAcierto4_2;
    private javax.swing.JLabel etiquetaAcierto4_3;
    private javax.swing.JLabel etiquetaAcierto4_4;
    private javax.swing.JLabel etiquetaAcierto5_1;
    private javax.swing.JLabel etiquetaAcierto5_2;
    private javax.swing.JLabel etiquetaAcierto5_3;
    private javax.swing.JLabel etiquetaAcierto5_4;
    private javax.swing.JLabel etiquetaAcierto6_1;
    private javax.swing.JLabel etiquetaAcierto6_2;
    private javax.swing.JLabel etiquetaAcierto6_3;
    private javax.swing.JLabel etiquetaAcierto6_4;
    private javax.swing.JLabel etiquetaAcierto7_1;
    private javax.swing.JLabel etiquetaAcierto7_2;
    private javax.swing.JLabel etiquetaAcierto7_3;
    private javax.swing.JLabel etiquetaAcierto7_4;
    private javax.swing.JLabel etiquetaAcierto8_1;
    private javax.swing.JLabel etiquetaAcierto8_2;
    private javax.swing.JLabel etiquetaAcierto8_3;
    private javax.swing.JLabel etiquetaAcierto8_4;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextArea textAreaInstrucciones;
    // End of variables declaration//GEN-END:variables

    // Método para cambiar el icono del programa.
    private void setIcono() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/mastermind/imagenes/icono.png")));
    }

    // Método para reordenar el String para mostrar los resultados.
    public String burbuja(String a) {
        int i, j, aux;
        for (i = 0; i < a.length() - 1; i++) {
            for (j = 0; j < a.length() - i - 1; j++) {
                if (a.charAt(j + 1) < a.charAt(j)) {
                    aux = a.charAt(j + 1);
                    a = replaceChar(a, j + 1, a.charAt(j));
                    a = replaceChar(a, j, (char) aux);
                }
            }
        }
        return a;
    }
    // Método para reemplazar el caracter correspondiente.
    public String replaceChar(String string, int pos, char newChar) {
        String aux = "";
        aux = string.substring(0, pos);
        aux += (char) newChar;
        try {
            aux += string.substring(pos + 1);
        } catch (Exception ex) {
        }
        return aux;
    }

}
