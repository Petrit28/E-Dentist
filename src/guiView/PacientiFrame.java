
package guiView;

import buisnessLogic.PacientiInterface;
import buisnessLogic.PacientiRepository;
import database.Pacienti;
import guiModel.PacientiModelTable;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import static java.util.Optional.empty;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Convert;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static jdk.nashorn.internal.runtime.Debug.id;
import main.MainFrame;


public class PacientiFrame extends javax.swing.JInternalFrame {
        
    PacientiInterface pacientiInterface=new PacientiRepository();
    
    PacientiModelTable pacientiModel=new PacientiModelTable();
    private ButtonGroup genderGroup;

    public PacientiFrame() {
        initComponents();
        tableLoad();
        tableMoveKey();
        genderGroup=new ButtonGroup();
        maleRadio.setActionCommand("M");
        femaleRadio.setActionCommand("F");
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        maleRadio.setSelected(true);
        

        
  
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nr_personalField = new javax.swing.JTextField();
        emriField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adresaField = new javax.swing.JTextField();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        vendlindjaField = new javax.swing.JTextField();
        komunaField = new javax.swing.JTextField();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emriPrinditField = new javax.swing.JTextField();
        mbiemriField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vendbanimiField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        kontaktiFrame = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(java.awt.Color.white);
        setIconifiable(true);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        table.setGridColor(new java.awt.Color(63, 63, 63));
        jScrollPane1.setViewportView(table);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));

        nr_personalField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        nr_personalField.setMaximumSize(new java.awt.Dimension(140, 24));
        nr_personalField.setMinimumSize(new java.awt.Dimension(140, 24));
        nr_personalField.setPreferredSize(new java.awt.Dimension(140, 24));
        nr_personalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nr_personalFieldActionPerformed(evt);
            }
        });

        emriField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        emriField.setMaximumSize(new java.awt.Dimension(140, 24));
        emriField.setMinimumSize(new java.awt.Dimension(140, 24));
        emriField.setPreferredSize(new java.awt.Dimension(140, 24));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(63, 63, 63));
        jLabel1.setText("Nr_Personal:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setText("Emri:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(63, 63, 63));
        jLabel3.setText("Emri i prindit:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(63, 63, 63));
        jLabel6.setText("Data e lindjes:");
        jLabel6.setMaximumSize(new java.awt.Dimension(70, 15));
        jLabel6.setMinimumSize(new java.awt.Dimension(70, 15));
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 15));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(63, 63, 63));
        jLabel7.setText("Vendlindja:");

        adresaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        adresaField.setMaximumSize(new java.awt.Dimension(140, 24));
        adresaField.setMinimumSize(new java.awt.Dimension(140, 24));
        adresaField.setPreferredSize(new java.awt.Dimension(140, 24));
        adresaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresaFieldActionPerformed(evt);
            }
        });

        maleRadio.setBackground(new java.awt.Color(255, 255, 255));
        maleRadio.setForeground(new java.awt.Color(63, 63, 63));
        maleRadio.setText("M");
        maleRadio.setBorder(null);
        maleRadio.setPreferredSize(new java.awt.Dimension(35, 24));
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setBackground(new java.awt.Color(255, 255, 255));
        femaleRadio.setForeground(new java.awt.Color(63, 63, 63));
        femaleRadio.setText("F");
        femaleRadio.setPreferredSize(new java.awt.Dimension(31, 24));
        femaleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioActionPerformed(evt);
            }
        });

        vendlindjaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        vendlindjaField.setMaximumSize(new java.awt.Dimension(140, 24));
        vendlindjaField.setMinimumSize(new java.awt.Dimension(140, 24));
        vendlindjaField.setPreferredSize(new java.awt.Dimension(140, 24));
        vendlindjaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendlindjaFieldActionPerformed(evt);
            }
        });

        komunaField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        komunaField.setMaximumSize(new java.awt.Dimension(140, 24));
        komunaField.setMinimumSize(new java.awt.Dimension(140, 24));
        komunaField.setPreferredSize(new java.awt.Dimension(140, 24));

        dateField.setBackground(new java.awt.Color(255, 255, 255));
        dateField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        dateField.setDateFormatString("yyyy-MM-dd");
        dateField.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        dateField.setDoubleBuffered(false);
        dateField.setMinimumSize(new java.awt.Dimension(140, 24));
        dateField.setPreferredSize(new java.awt.Dimension(140, 24));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(63, 63, 63));
        jLabel8.setText("Adresa:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(63, 63, 63));
        jLabel5.setText("Gjinia:");
        jLabel5.setMaximumSize(new java.awt.Dimension(70, 15));
        jLabel5.setMinimumSize(new java.awt.Dimension(70, 15));
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 15));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(63, 63, 63));
        jLabel9.setText("Komuna:");

        emriPrinditField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        emriPrinditField.setMaximumSize(new java.awt.Dimension(140, 24));
        emriPrinditField.setMinimumSize(new java.awt.Dimension(140, 24));
        emriPrinditField.setPreferredSize(new java.awt.Dimension(140, 24));

        mbiemriField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        mbiemriField.setMaximumSize(new java.awt.Dimension(140, 24));
        mbiemriField.setMinimumSize(new java.awt.Dimension(140, 24));
        mbiemriField.setPreferredSize(new java.awt.Dimension(140, 24));
        mbiemriField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbiemriFieldActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(63, 63, 63));
        jLabel10.setText("Mbiemri:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(63, 63, 63));
        jLabel4.setText("Vendbanimi:");

        vendbanimiField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(63, 63, 63), 2));
        vendbanimiField.setMaximumSize(new java.awt.Dimension(140, 24));
        vendbanimiField.setMinimumSize(new java.awt.Dimension(140, 24));
        vendbanimiField.setPreferredSize(new java.awt.Dimension(146, 24));
        vendbanimiField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendbanimiFieldActionPerformed(evt);
            }
        });

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delet.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setContentAreaFilled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cncl.png"))); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(174, 174, 174)))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(mbiemriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(emriField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nr_personalField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emriPrinditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendlindjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(komunaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nr_personalField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emriField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emriPrinditField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(mbiemriField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(femaleRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendlindjaField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendbanimiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(komunaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        dateField.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        kontaktiFrame.setText("Kontakti");
        kontaktiFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontaktiFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kontaktiFrame)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kontaktiFrame)
                        .addGap(15, 15, 15)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearFields();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            Pacienti p=pacientiModel.getPacienti(row);
            int nr_personal=Integer.parseInt(nr_personalField.getText());
            String emri=emriField.getText();
            String emri_prindit=emriPrinditField.getText();
            String g=genderGroup.getSelection().getActionCommand();
            char gjinia=g.charAt(0);
            String komuna=komunaField.getText();
            String adresa=adresaField.getText();
            p.setNrpersonal(nr_personal);
            p.setEmri(emri);
            p.setMbiemri(mbiemriField.getText());
            p.setEmriprindit(emri_prindit);
            p.setAdresa(adresa);
            p.setDatalindjes(dateField.getDate());
            p.setVendbanimi(vendbanimiField.getText());
            p.setVendlindja(vendlindjaField.getText());
            p.setAdresa(adresa);
            p.setGjinia(gjinia);
            p.setKomuna(komuna);
            pacientiInterface.edit(p);
            clearFields();
            tableLoad();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
            Pacienti p=pacientiModel.getPacienti(row);
            pacientiInterface.delete(p);
            clearFields();
            tableLoad();

        }
        else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        Pacienti p=new Pacienti();
        int nr_personal=Integer.parseInt(nr_personalField.getText());
        String emri=emriField.getText();
        String emri_prindit=emriPrinditField.getText();
        String g=genderGroup.getSelection().getActionCommand();
        char gjinia=g.charAt(0);

        String komuna=komunaField.getText();
        String adresa=adresaField.getText();
        p.setNrpersonal(nr_personal);
        p.setEmri(emri);
        p.setMbiemri(mbiemriField.getText());
        p.setEmriprindit(emri_prindit);
        p.setAdresa(adresa);
        p.setDatalindjes(dateField.getDate());
        p.setVendbanimi(vendbanimiField.getText());
        p.setVendlindja(vendlindjaField.getText());
        p.setAdresa(adresa);
        p.setGjinia(gjinia);
        p.setKomuna(komuna);

        pacientiInterface.create(p);
        tableLoad();

    }//GEN-LAST:event_addButtonActionPerformed

    private void vendbanimiFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendbanimiFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendbanimiFieldActionPerformed

    private void mbiemriFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbiemriFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbiemriFieldActionPerformed

    private void vendlindjaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendlindjaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vendlindjaFieldActionPerformed

    private void femaleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioActionPerformed

    }//GEN-LAST:event_femaleRadioActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed

    }//GEN-LAST:event_maleRadioActionPerformed

    private void adresaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresaFieldActionPerformed

    private void nr_personalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nr_personalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nr_personalFieldActionPerformed

    private void kontaktiFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontaktiFrameActionPerformed
        int row=table.getSelectedRow();
        if(row!=-1){
        Pacienti p = new Pacienti();
        int nr_personal=Integer.parseInt(nr_personalField.getText());
        String emri=emriField.getText();
        String emri_prindit=emriPrinditField.getText();
        String g=genderGroup.getSelection().getActionCommand();
        char gjinia=g.charAt(0);

        String komuna=komunaField.getText();
        String adresa=adresaField.getText();
        p.setNrpersonal(nr_personal);
        p.setEmri(emri);
        p.setMbiemri(mbiemriField.getText());
        p.setEmriprindit(emri_prindit);
        p.setAdresa(adresa);
        p.setDatalindjes(dateField.getDate());
        p.setVendbanimi(vendbanimiField.getText());
        p.setVendlindja(vendlindjaField.getText());
        p.setAdresa(adresa);
        p.setGjinia(gjinia);
        p.setKomuna(komuna);
        panel1.removeAll();
        KontaktiFrame kf = new KontaktiFrame(p);
        panel1.add(kf);
        kf.show();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nuk keni selektuar asgje");
        }
    }//GEN-LAST:event_kontaktiFrameActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField adresaField;
    private javax.swing.JButton cancelButton;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField emriField;
    private javax.swing.JTextField emriPrinditField;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField komunaField;
    private javax.swing.JButton kontaktiFrame;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField mbiemriField;
    private javax.swing.JTextField nr_personalField;
    private java.awt.Panel panel1;
    private javax.swing.JTable table;
    private javax.swing.JTextField vendbanimiField;
    private javax.swing.JTextField vendlindjaField;
    // End of variables declaration//GEN-END:variables

    private void tableLoad(){
       List<Pacienti>listPacienti=pacientiInterface.findAll();
        pacientiModel.add(listPacienti);
        table.setModel(pacientiModel);
        pacientiModel.fireTableDataChanged(); 
    }

    private void tabelaMoveKey() {
        
    }
  

   public void clearFields(){
        adresaField.setText("");
        komunaField.setText("");
        emriField.setText("");
        mbiemriField.setText("");
        komunaField.setText("");
        adresaField.setText("");
        emriPrinditField.setText("");
        dateField.setDate(null);
        nr_personalField.setText("");
        vendbanimiField.setText("");
        vendlindjaField.setText("");
        
        genderGroup.clearSelection();
        table.clearSelection();
        
    }
    private void tableMoveKey(){
        ListSelectionModel rowSM = table.getSelectionModel();
        
        rowSM.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting())
                    return; // if you don't want to handle intermediate selections
                ListSelectionModel rowSM = (ListSelectionModel)e.getSource();
                int selectedIndex = rowSM.getMinSelectionIndex();
                if(selectedIndex > -1){
                    Pacienti p = pacientiModel.getPacienti(selectedIndex);
                    nr_personalField.setText(p.getNrpersonal()+"");
                    komunaField.setText(p.getKomuna());
                    emriField.setText(p.getEmri());
                    mbiemriField.setText(p.getMbiemri());
                    adresaField.setText(p.getAdresa());
                    emriPrinditField.setText(p.getEmriprindit());
                    dateField.setDate(p.getDatalindjes());
                    genderGroup.getSelection().getActionCommand();
                    vendlindjaField.setText(p.getVendlindja());
                    vendbanimiField.setText(p.getVendbanimi());
                    
                    if(p.getGjinia()=='M'){
                         genderGroup.add(maleRadio);
                         maleRadio.setSelected(true);
                         femaleRadio.setSelected(false);
                    }else{
                    genderGroup.add(femaleRadio);
                    femaleRadio.setSelected(true);
                    maleRadio.setSelected(false);
                    }
                       
                }
            }
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
}
