/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author sun
 */
public class JPGradient extends JPanel{
    
   @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color color2 = new Color(4, 98, 224);
        Color color1 = new Color(198, 218, 245);
        GradientPaint gp = new GradientPaint(0, 0, color2, w, h, color1);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
