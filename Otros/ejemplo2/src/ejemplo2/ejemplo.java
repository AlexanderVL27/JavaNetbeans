/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;
import javax.swing.JButton;
import javax.swing.*;
import java.applet.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent; // Class defi ning events
import java.awt.event.ActionListener; // Interface for receiving events
public class ejemplo extends JApplet implements ActionListener {
 @Override
 public void init() {
 try {
 SwingUtilities.invokeAndWait(new Runnable() {
 public void run() {
 createAppletGUI();
 }
 });
 } catch (Exception e) {
 System.err.println("Applet GUI creation failed.");
 }
 }
 private void createAppletGUI() {
 Container content = getContentPane();
 content.setLayout(card); // Set card as the layout mgr
 JButton button; // Stores a button
 for(int i = 1; i <= 6; ++i) {
 // Add a button
 content.add(button = new JButton(" Press " + i), "Card" + i);
 button.addActionListener(this); // Add listener for button
 }
 card.show(content, "Card5"); // Show the 5th card to start
 }
 // Handle button events
 public void actionPerformed(ActionEvent e) {
 card.next(getContentPane()); // Switch to the next card
 }
 private CardLayout card = new CardLayout(50,50);// The layout manager
}
