import javax.script.Bindings;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TugasAkhirDkp extends javax.swing.JFrame{

    private javax.swing.JButton buttonoke;
    private javax.swing.JButton buttonprint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel labelharga;
    private javax.swing.JLabel labelid;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel labelnom;
    private javax.swing.JLabel labelppj;
    private javax.swing.JTextField textid;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField textnom;
    private javax.swing.JTextArea textout;

    public TugasAkhirDkp(){
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelnama = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        labelid = new javax.swing.JLabel();
        labelnom = new javax.swing.JLabel();
        textnama = new javax.swing.JTextField();
        textnom = new javax.swing.JTextField();
        buttonoke = new javax.swing.JButton();
        buttonprint = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textout = new javax.swing.JTextArea();
        labelharga = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        labelppj = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Pembelian Token Listrik");
        setBackground(new java.awt.Color(102, 255, 255));
        setResizable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imagesthun.png")));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        labelnama.setText("Nama Pembeli");
        labelnama.setFont(new java.awt.Font("Times New Roman", 0, 14));
        labelnama.setText("Nama Pembeli");

        labelid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelid.setText("No. ID Pelanggan");

        labelnom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelnom.setText("Nominal  (Rp.)");

        buttonoke.setBackground(new java.awt.Color(255, 255, 255));
        buttonoke.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonoke.setForeground(new java.awt.Color(204, 0, 204));
        buttonoke.setText("OKE");
        buttonoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonokeActionPerformed(evt);
            }
        });

        buttonprint.setBackground(new java.awt.Color(255, 255, 255));
        buttonprint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonprint.setForeground(new java.awt.Color(255, 0, 255));
        buttonprint.setText("PRINT ");
        buttonprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonprintActionPerformed(evt);
            }
        });

        textout.setColumns(20);
        textout.setRows(5);
        jScrollPane1.setViewportView(textout);

        labelharga.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelharga.setText("Harga : Rp. 1500 / KWh");

        judul.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        judul.setText("Program Pembelian Token Listrik");

        labelppj.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        labelppj.setText("Pajak Penerangan Jalan 2%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelnom)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textnom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelnama)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textnama, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelid)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelharga, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(buttonoke, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(buttonprint, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(labelppj)
                                                                .addGap(0, 10, Short.MAX_VALUE)))))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(judul)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelnama)
                                                        .addComponent(labelharga)
                                                        .addComponent(textnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelid)
                                                        .addComponent(labelppj)
                                                        .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(labelnom)
                                                        .addComponent(textnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(buttonoke))
                                                .addGap(15, 15, 15)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(buttonprint, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }
    String kp,kb;
    double hasil,harga,ppj,pp;
    int idp,nominal,angk;

    public void cetak(){
        String idp = textid.getText();
        String nominal = textnom.getText();
        String nama = textnama.getText();

        for (int i = 0; i < 37; i++) {
            textout.setText(textout.getText() + "*");
        }
        textout.setText(textout.getText() + "\nProgram Pembelian Token Listrik \n");
        for (int i = 0; i < 37; i++) {
            textout.setText(textout.getText() + "*");
        }
        textout.setText(textout.getText() + "\n");
        textout.setText(textout.getText() + "\nNama Pembeli       : " + nama + "\n");
        textout.setText(textout.getText() + "ID Pelanggan         : " + idp + "\n");
        textout.setText(textout.getText() + "Nominal                 : Rp. " + nominal + "\n");
        textout.setText(textout.getText() + "KWh yang didapat : " + hasil + " KWh \n");
        textout.setText(textout.getText() + "Kode Pembayaran : " + kb );
        textout.setText(textout.getText() + "\n");
        textout.setText(textout.getText() + "\nSegera selesaikan pembayaran lewat kasir\n");
        textout.setText(textout.getText() + "atau transfer bank dengan cara masukkan\n");
        textout.setText(textout.getText() + "kode pembayaran\n");
    }

    public void gagal(){
        textout.setText(textout.getText() + "\n");
        textout.setText(textout.getText() + "\nTransaksi Gagal, coba periksa kembali\n");
        textout.setText(textout.getText() + "transaksi anda\n");
        buttonprint.setEnabled(false);

    }

    private void buttonokeActionPerformed(ActionEvent evt) {
        textout.setText("");
        if (textnama.getText().equals("")) {
            gagal();
        }
        else if (textid.getText().equals("")) {
            gagal();
        }
        else if (textnom.getText().equals("")) {
            gagal();
        }
        else{
            idp = Integer.parseInt(textid.getText());
            nominal = Integer.parseInt(textnom.getText());
            Random random = new Random();
            angk = 0;
            angk = random.nextInt(1000);
            kp = Integer.toString(angk);
            kb = "RA" + kp + idp;

            if (nominal >= 100000) {
                buttonprint.setEnabled(true);
                harga = 1300; }
            else if (nominal >= 50000) {
                buttonprint.setEnabled(true);
                harga = 1400; }
            else if (nominal >= 1) {
                buttonprint.setEnabled(true);
                harga = 1500; }
            else {
                kb = "Gagal mencetak kode, periksa kembali transaksi anda";
                buttonprint.setEnabled(false); }
            pp = nominal / 50;
            ppj = nominal - pp;
            hasil = ppj / harga;
            cetak();
        }
    }

    private void buttonprintActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            textout.print();
        } catch (PrinterException ex) {
            Logger.getLogger(TugasAkhirDkp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TugasAkhirDkp().setVisible(true);
            }
        });
    }
}
