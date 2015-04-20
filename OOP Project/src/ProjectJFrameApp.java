

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paul1997
 */
public class ProjectJFrameApp extends javax.swing.JFrame {
    JPanel cardsContainer;
    
    
    /**
     * Creates new form PhysicsJFrame
     */
    public ProjectJFrameApp() {
        initComponents();
        //Physics
            MainPage mainCard = new MainPage();
            PhysicsGUI physicsCard = new PhysicsGUI();
            FormulasGUI formulasCard = new FormulasGUI();
            QuizzesGui quizCard = new QuizzesGui();
            WavesGUI waveCard = new WavesGUI();
            ExperimentQuizGUi  expCard = new ExperimentQuizGUi();
            MechanicsFormGUI mechCard = new MechanicsFormGUI();
            ModPhysicsGUI modCard = new ModPhysicsGUI();
            GenQuizGUI genQCard = new GenQuizGUI();
            Timeline timeCard = new Timeline();
            
        //Geography
            Geography geographyCard = new Geography ();
            Quiz quizGeoCard = new Quiz ();
            TextQuizGeoGUI textQuizGeoGUICard = new TextQuizGeoGUI ();
            ImageGalleryGeo imageGalleryCard = new ImageGalleryGeo ();
            NotesGeo notesGeoCard = new NotesGeo ();
            VolcanoesImages volcanoesImagesCard = new VolcanoesImages ();
            RockImages rockImagesCard = new RockImages ();
            EarthImages earthImagesCard = new EarthImages();
            MapImages mapImagesCard = new MapImages();
            VolcanoesCard volcanoesCardCard = new VolcanoesCard();
            MapCard mapCardCard = new MapCard();
            EarthCard earthCardCard = new EarthCard();
            RocksCard rocksCardCard = new RocksCard();
            EarthsNoteGUI earthsNoteGUICard = new EarthsNoteGUI();
            MapsNoteGUI mapsNoteGUICard = new MapsNoteGUI();
            RocksNoteGUI rocksNoteGUICard = new RocksNoteGUI();
            VolcanoesNotesGUI volcanoesNotesGUICard = new VolcanoesNotesGUI();
                    
        //Maths
            Exam_Papers  examCard= new Exam_Papers();
            MathsFormulas mFormCard = new MathsFormulas();
            Maths_Quiz mQuizCard = new Maths_Quiz();
            Maths_Topics topicsCard = new Maths_Topics();
            
        //Biology
            Biology BioCard = new Biology();
            NotesBio NotesBioCard = new NotesBio();
            BioHbNotes BioHbCard = new BioHbNotes();
            BioNutriNotes BioNutriCard = new BioNutriNotes();
            BioCellsNotes BioCellsCard = new BioCellsNotes();
            BioGeneticsNotes BioGeneticsCard = new BioGeneticsNotes();
            
           //Pop Quiz
            BioPopQuizMenu BioPopQuizMenuCard = new BioPopQuizMenu();
           //IMAGE QUIZ
            BioImageQuiz BioImageQuizCard = new BioImageQuiz();
            BioImageQuiz2 BioImageQuiz2Card = new BioImageQuiz2();
            BioImageQuiz3 BioImageQuiz3Card = new BioImageQuiz3();
            
            
            //physics
    cardsContainer = new JPanel(new CardLayout ());
    cardsContainer.add(mainCard, "Main");
    cardsContainer.add(physicsCard, "Physics");
    cardsContainer.add(formulasCard, "Formulas");
    cardsContainer.add(quizCard, "Quizzes");
    cardsContainer.add(waveCard, "Waves");
    cardsContainer.add(expCard, "Experiments");
    cardsContainer.add(mechCard, "Mechanics");
    cardsContainer.add(modCard, "ModernPhysics");
    cardsContainer.add(genQCard, "GeneralQuiz");
    cardsContainer.add(timeCard, "Timeline");
    
     //Geography
    cardsContainer.add(geographyCard, "Geography");
    cardsContainer.add(quizGeoCard, "Quiz");
    cardsContainer.add(textQuizGeoGUICard, "Text Quiz");
    cardsContainer.add(imageGalleryCard, "Image Gallery");
    cardsContainer.add(notesGeoCard, "Notes");
    cardsContainer.add(volcanoesImagesCard, "Volcanoe Image");
    cardsContainer.add(rockImagesCard, "Rock Image");
    cardsContainer.add(earthImagesCard, "Earth Image");
    cardsContainer.add(mapImagesCard, "Map Image");
    cardsContainer.add(volcanoesCardCard, "Volcanoes Card");
    cardsContainer.add(earthCardCard, "Earth Card");
    cardsContainer.add(rocksCardCard, "Rock Card");
    cardsContainer.add(mapCardCard, "Map Card");
    cardsContainer.add(earthsNoteGUICard,"Earth Note");
    cardsContainer.add(mapsNoteGUICard,"Maps Note");
    cardsContainer.add(rocksNoteGUICard,"Rocks Note");
    cardsContainer.add(volcanoesNotesGUICard,"Volcanoes Note");
    
    //Maths
    cardsContainer.add(topicsCard, "Topics");
    cardsContainer.add(mQuizCard, "MathsQuiz");
    cardsContainer.add(mFormCard, "MathsFormulas");
    cardsContainer.add(examCard, "Exams");
    
   //Biology
   cardsContainer.add(BioCard, "Biology");
   cardsContainer.add(NotesBioCard, "NotesBio");
   cardsContainer.add(BioHbCard, "BioHbNotes");
   cardsContainer.add(BioNutriCard, "BioNutriNotes");
   cardsContainer.add(BioCellsCard, "BioCellsNotes");
   cardsContainer.add(BioGeneticsCard, "BioGeneticsNotes");
   cardsContainer.add(BioImageQuizCard,"BioImageQuiz");
   cardsContainer.add(BioImageQuiz2Card,"BioImageQuiz2");
   cardsContainer.add(BioImageQuiz3Card,"BioImageQuiz3");
   cardsContainer.add(BioPopQuizMenuCard, "BioPopQuizMenu");
   
        this.add(cardsContainer);
        CardLayout cl = (CardLayout)(cardsContainer.getLayout());
        cl.show(cardsContainer, "Main");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 500));
        setPreferredSize(new java.awt.Dimension(450, 500));
        getContentPane().setLayout(new java.awt.FlowLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param  args the command line arguments
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
            java.util.logging.Logger.getLogger(ProjectJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectJFrameApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            @Override
            public void run() {
                new ProjectJFrameApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
