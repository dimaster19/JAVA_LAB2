    import java.awt.*;
    public class ColoredRect extends DrawableRect{
            Color inColor = Color.GREEN;

            public void draw(Graphics g) {
                g.setColor(outColor);
                g.drawRect(getX1(), getY1(), getWidth(), getHeight());
                g.setColor(inColor);
                g.fillRect(getX1(), getY1(), getWidth(), getHeight());
        
            }
    }
