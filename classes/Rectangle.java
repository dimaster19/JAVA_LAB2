    public class Rectangle {
        private int x1, y1, x2, y2;
        
        public int getX1() {
            return x1;
        }
        public int getY1() {
            return y1;
        }
        public int getWidth() {
            return x2-x1;
        }
        public int getHeight() {
            return y2-y1;
        }
        public void setX1(int x1) {
            this.x1 = x1;
        }
        public void setY1(int y1) {
            this.y1 = y1;
        }
        public void setX2(int x2) {
            this.x2 = x2;
        }
        public void setY2(int y2) {
            this.y2 = y2;
        }
        
        public Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
           if(x2 <= x1 || y2 <= y1)
           {
              throw new IllegalArgumentException("Переданы неверные параметры");
           }
        }
    
        public Rectangle(int width, int height) {
            x1 = 0;
            y1 = 0;
            x2 = width;
            y2 = height;
    
            if(x2 <= x1 || y2 <= y1)
            {
               throw new IllegalArgumentException("Переданы неверные параметры");
            }
        }
    
        public Rectangle() {
            x1 = 0;
            y1 = 0;
            x2 = 0;
            y2 = 0;
        }
    
        public void rect_print() {
            System.out.println(x1 + "," + y1 + "," + x2 + "," + y2);
        }
    
        public void move(int x, int y) {
            if (x1 + x < 0 || x2 + x < 0)
                throw new IllegalArgumentException("Переданы неверные параметры");;
            if (y1 + y < 0 || y2 + y < 0)
                throw new IllegalArgumentException("Переданы неверные параметры");;
    
            x1 += x;
            x2 += x;
    
            y1 += y;
            y2 += y;
        }
    
        public void union(Rectangle rect1, Rectangle rect2) {
         
            x1 = rect1.x1 > rect2.x1 ? rect2.x1 : rect1.x1;
            y1 = rect1.y1 > rect2.y1 ? rect2.y1 : rect1.y1;
            x2 = rect1.x2 > rect2.x2 ? rect1.x2 : rect2.x2;
            y2 = rect1.y2 > rect2.x2 ? rect1.y2 : rect2.y2;
    
            if(x2 <= x1 || y2 <= y1)
            {
               throw new IllegalArgumentException("Переданы неверные параметры");
            }
          
        }
    
    }
   

