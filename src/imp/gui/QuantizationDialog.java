/**
 * This Java Class is part of the Impro-Visor Application
 *
 * Copyright (C) 2016 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * Impro-Visor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * merchantability or fitness for a particular purpose.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Impro-Visor; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package imp.gui;

/**
 *
 * @author keller
 */
public class QuantizationDialog extends javax.swing.JDialog
  {
  Notate notate;
    /**
     * Creates new form QuantizationDialog
     */
    public QuantizationDialog(Notate notate, boolean modal)
    {
        super(notate, modal);
        this.notate = notate;
        initComponents();
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        noneQuantizationBox = new javax.swing.JCheckBox();
        noTripletQuantizationBox = new javax.swing.JCheckBox();
        quarterNoteQuantizationBox = new javax.swing.JCheckBox();
        quarterNoteTripletQuantizationBox = new javax.swing.JCheckBox();
        eighthNoteQuantizationBox = new javax.swing.JCheckBox();
        eighthNoteTripletQuantizationBox = new javax.swing.JCheckBox();
        sixteenthNoteQuantizationBox = new javax.swing.JCheckBox();
        sixteenthNoteTripletQuantizationBox = new javax.swing.JCheckBox();
        thirtysecondNoteQuantizationBox = new javax.swing.JCheckBox();
        thirtysecondNoteTripletQuantizationBox = new javax.swing.JCheckBox();
        eighthNoteSwingBox = new javax.swing.JCheckBox();
        quantizeButton = new javax.swing.JButton();

        setTitle("Quantize Chorus");
        setBounds(new java.awt.Rectangle(650, 25, 0, 0));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        noneQuantizationBox.setSelected(true);
        noneQuantizationBox.setText("None");
        noneQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noneQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(noneQuantizationBox, gridBagConstraints);

        noTripletQuantizationBox.setSelected(true);
        noTripletQuantizationBox.setText("No Triplet");
        noTripletQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                noTripletQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(noTripletQuantizationBox, gridBagConstraints);

        quarterNoteQuantizationBox.setSelected(true);
        quarterNoteQuantizationBox.setText("Quarter-Note");
        quarterNoteQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quarterNoteQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(quarterNoteQuantizationBox, gridBagConstraints);

        quarterNoteTripletQuantizationBox.setSelected(true);
        quarterNoteTripletQuantizationBox.setText("Quarter-Note Triplet");
        quarterNoteTripletQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quarterNoteTripletQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(quarterNoteTripletQuantizationBox, gridBagConstraints);

        eighthNoteQuantizationBox.setSelected(true);
        eighthNoteQuantizationBox.setText("Eighth-Note");
        eighthNoteQuantizationBox.setActionCommand("Eighth-Note");
        eighthNoteQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eighthNoteQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(eighthNoteQuantizationBox, gridBagConstraints);

        eighthNoteTripletQuantizationBox.setSelected(true);
        eighthNoteTripletQuantizationBox.setText("Eighth-Note Triplet");
        eighthNoteTripletQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eighthNoteTripletQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(eighthNoteTripletQuantizationBox, gridBagConstraints);

        sixteenthNoteQuantizationBox.setText("Sixteenth-Note");
        sixteenthNoteQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sixteenthNoteQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(sixteenthNoteQuantizationBox, gridBagConstraints);

        sixteenthNoteTripletQuantizationBox.setText("Sixteenth-Note Triplet");
        sixteenthNoteTripletQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                sixteenthNoteTripletQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(sixteenthNoteTripletQuantizationBox, gridBagConstraints);

        thirtysecondNoteQuantizationBox.setText("Thirty-Second-Note");
        thirtysecondNoteQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                thirtysecondNoteQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(thirtysecondNoteQuantizationBox, gridBagConstraints);

        thirtysecondNoteTripletQuantizationBox.setText("Thirty-Second Triplet");
        thirtysecondNoteTripletQuantizationBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                thirtysecondNoteTripletQuantizationBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(thirtysecondNoteTripletQuantizationBox, gridBagConstraints);

        eighthNoteSwingBox.setText("Swing Eighth-Notes");
        eighthNoteSwingBox.setToolTipText("");
        eighthNoteSwingBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eighthNoteSwingBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(eighthNoteSwingBox, gridBagConstraints);

        quantizeButton.setText("Quantize");
        quantizeButton.setContentAreaFilled(false);
        quantizeButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quantizeButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        getContentPane().add(quantizeButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static final int 
            MAXIMUM_QUANTUM = 480,
            QUARTER_NOTE_QUANTUM = 120,
            QUARTER_NOTE_TRIPLET_QUANTUM = 80,
            EIGHTH_NOTE_QUANTUM = 60,
            EIGHTH_NOTE_TRIPLET_QUANTUM = 40,
            SIXTEENTH_NOTE_QUANTUM = 30,
            SIXTEENTH_NOTE_TRIPLET_QUANTUM = 20,
            THIRTYSECOND_NOTE_QUANTUM = 15,
            THIRTYSECOND_NOTE_TRIPLET_QUANTUM = 10,
            MINIMUM_QUANTUM = 1;
    
    private final int quantum[] = {60, 40};
    
    public int[] getQuanta()
    {
        return quantum;
    }
    
    private void noneQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noneQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_noneQuantizationBoxActionPerformed
            quantum[0] = MAXIMUM_QUANTUM;
            thirtysecondNoteQuantizationBox.setSelected(false);
            sixteenthNoteQuantizationBox.setSelected(false);
            eighthNoteQuantizationBox.setSelected(false);
            quarterNoteQuantizationBox.setSelected(false);
            noneQuantizationBox.setSelected(true);
    }//GEN-LAST:event_noneQuantizationBoxActionPerformed

    private void noTripletQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_noTripletQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_noTripletQuantizationBoxActionPerformed

            quantum[1] = MAXIMUM_QUANTUM;
            thirtysecondNoteTripletQuantizationBox.setSelected(false);
            sixteenthNoteTripletQuantizationBox.setSelected(false);
            eighthNoteTripletQuantizationBox.setSelected(false);
            quarterNoteTripletQuantizationBox.setSelected(false);
            noTripletQuantizationBox.setSelected(true);
            
    }//GEN-LAST:event_noTripletQuantizationBoxActionPerformed

    private void quarterNoteQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quarterNoteQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_quarterNoteQuantizationBoxActionPerformed
        if( quarterNoteQuantizationBox.isSelected() )
          {
            noneQuantizationBox.setSelected(true);
            quantum[0] = QUARTER_NOTE_QUANTUM;
          }
        else
          {
            quantum[0] = MAXIMUM_QUANTUM;
            thirtysecondNoteQuantizationBox.setSelected(false);
            sixteenthNoteQuantizationBox.setSelected(false);
            eighthNoteQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_quarterNoteQuantizationBoxActionPerformed

    private void quarterNoteTripletQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quarterNoteTripletQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_quarterNoteTripletQuantizationBoxActionPerformed
        if( quarterNoteTripletQuantizationBox.isSelected() )
          {
            noTripletQuantizationBox.setSelected(true);
            quantum[1] = QUARTER_NOTE_TRIPLET_QUANTUM;
          }
        else
          {
            quantum[1] = MAXIMUM_QUANTUM;
            thirtysecondNoteTripletQuantizationBox.setSelected(false);
            sixteenthNoteTripletQuantizationBox.setSelected(false);
            eighthNoteTripletQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_quarterNoteTripletQuantizationBoxActionPerformed

    private void eighthNoteQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eighthNoteQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_eighthNoteQuantizationBoxActionPerformed
        if( eighthNoteQuantizationBox.isSelected() )
          {
            quarterNoteQuantizationBox.setSelected(true);
            noneQuantizationBox.setSelected(true);
            quantum[0] = EIGHTH_NOTE_QUANTUM;
         }
        else
          {
            quantum[0] = QUARTER_NOTE_QUANTUM;
            thirtysecondNoteQuantizationBox.setSelected(false);
            sixteenthNoteQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_eighthNoteQuantizationBoxActionPerformed

    private void eighthNoteTripletQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eighthNoteTripletQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_eighthNoteTripletQuantizationBoxActionPerformed
       if( eighthNoteTripletQuantizationBox.isSelected() )
          {
            quarterNoteTripletQuantizationBox.setSelected(true);
            noTripletQuantizationBox.setSelected(true);
            quantum[1] = EIGHTH_NOTE_TRIPLET_QUANTUM;
         }
        else
          {
            quantum[1] = QUARTER_NOTE_TRIPLET_QUANTUM;
            thirtysecondNoteTripletQuantizationBox.setSelected(false);
            sixteenthNoteTripletQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_eighthNoteTripletQuantizationBoxActionPerformed

    private void sixteenthNoteQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sixteenthNoteQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_sixteenthNoteQuantizationBoxActionPerformed
        if( sixteenthNoteQuantizationBox.isSelected() )
          {
            eighthNoteQuantizationBox.setSelected(true);
            quarterNoteQuantizationBox.setSelected(true);
            noneQuantizationBox.setSelected(true);
            quantum[0] = SIXTEENTH_NOTE_QUANTUM;
          }
        else
          {
            quantum[1] = EIGHTH_NOTE_QUANTUM;
            thirtysecondNoteQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_sixteenthNoteQuantizationBoxActionPerformed

    private void sixteenthNoteTripletQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_sixteenthNoteTripletQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_sixteenthNoteTripletQuantizationBoxActionPerformed
        if( sixteenthNoteTripletQuantizationBox.isSelected() )
          {
            eighthNoteTripletQuantizationBox.setSelected(true);
            quarterNoteTripletQuantizationBox.setSelected(true);
            noTripletQuantizationBox.setSelected(true);
            quantum[1] = SIXTEENTH_NOTE_TRIPLET_QUANTUM;
         }
        else
          {
            quantum[1] = EIGHTH_NOTE_TRIPLET_QUANTUM;
            thirtysecondNoteTripletQuantizationBox.setSelected(false);
          }
    }//GEN-LAST:event_sixteenthNoteTripletQuantizationBoxActionPerformed

    private void thirtysecondNoteQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_thirtysecondNoteQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_thirtysecondNoteQuantizationBoxActionPerformed
         if( thirtysecondNoteQuantizationBox.isSelected() )
          {
            sixteenthNoteQuantizationBox.setSelected(true);
            eighthNoteQuantizationBox.setSelected(true);
            quarterNoteQuantizationBox.setSelected(true);
            noneQuantizationBox.setSelected(true);
            quantum[0] = THIRTYSECOND_NOTE_QUANTUM;
          }
          else
          {
            quantum[0] = SIXTEENTH_NOTE_QUANTUM;
          }
    }//GEN-LAST:event_thirtysecondNoteQuantizationBoxActionPerformed

    private void thirtysecondNoteTripletQuantizationBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_thirtysecondNoteTripletQuantizationBoxActionPerformed
    {//GEN-HEADEREND:event_thirtysecondNoteTripletQuantizationBoxActionPerformed
         if( thirtysecondNoteTripletQuantizationBox.isSelected() )
          {
            sixteenthNoteTripletQuantizationBox.setSelected(true);
            eighthNoteTripletQuantizationBox.setSelected(true);
            quarterNoteTripletQuantizationBox.setSelected(true);
            noTripletQuantizationBox.setSelected(true);
            quantum[1] = THIRTYSECOND_NOTE_TRIPLET_QUANTUM;
          }
         else
         {
            quantum[0] = SIXTEENTH_NOTE_TRIPLET_QUANTUM;
          }
    }//GEN-LAST:event_thirtysecondNoteTripletQuantizationBoxActionPerformed

    private void eighthNoteSwingBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eighthNoteSwingBoxActionPerformed
    {//GEN-HEADEREND:event_eighthNoteSwingBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eighthNoteSwingBoxActionPerformed

    private void quantizeButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quantizeButtonActionPerformed
    {//GEN-HEADEREND:event_quantizeButtonActionPerformed
        notate.newQuantize(eighthNoteSwingBox.isSelected());
    }//GEN-LAST:event_quantizeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox eighthNoteQuantizationBox;
    private javax.swing.JCheckBox eighthNoteSwingBox;
    private javax.swing.JCheckBox eighthNoteTripletQuantizationBox;
    private javax.swing.JCheckBox noTripletQuantizationBox;
    private javax.swing.JCheckBox noneQuantizationBox;
    private javax.swing.JButton quantizeButton;
    private javax.swing.JCheckBox quarterNoteQuantizationBox;
    private javax.swing.JCheckBox quarterNoteTripletQuantizationBox;
    private javax.swing.JCheckBox sixteenthNoteQuantizationBox;
    private javax.swing.JCheckBox sixteenthNoteTripletQuantizationBox;
    private javax.swing.JCheckBox thirtysecondNoteQuantizationBox;
    private javax.swing.JCheckBox thirtysecondNoteTripletQuantizationBox;
    // End of variables declaration//GEN-END:variables
  }
