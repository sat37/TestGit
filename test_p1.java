class test_p1{
public static void main(String args [])
{
display();
test_p1 t=new test_p1();
t.show();
}
static void display()
{
System.out.println("this is static method");
}
void show(){
System.out.println("this is non static method");
}

}
