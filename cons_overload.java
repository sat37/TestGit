class Box
{
    int L,B;
    static int count;
    Box()
    {
        L=B=5;
        count++;
     }
     Box(int x,int y)
        {
            L=x;
            B=y;
            count++;
        }
      Box(Box obj_box)
      {
        this.L=obj_box.L;
        this.B=obj_box.B;
        count++;
      }
      void show()
      {
        System.out.println("Length is "+L+"Breadth is "+B);
        System.out.println("Total object created is "+ count);
      }
  }
  class cons_overload
  {
    public static void main(String args[])
    {
        Box one=new Box();
        one.show();
        Box two=new Box(10,20);
        two.show();
        Box three=new Box(one);
        three.show();
        Box four=new Box(two);
        four.show();
     }
 }
    
    
