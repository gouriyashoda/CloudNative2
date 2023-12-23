Demo or Main Class:
package com.example.demo;
//imports
@SpringBootApplication
public class DemoApplication {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
SpringApplication.run(DemoApplication.class, args);
ApplicationContext ac = new ClassPathXmlApplicationContext(&quot;testBean.xml&quot;);
Customer c = (Customer) ac.getBean(&quot;customer&quot;);
Ticket t = (Ticket) c.getTick();
while(true) {
System.out.println(&quot;1. insert the details\n 2. Display details \n&quot;
+ &quot;3. exit&quot;);
System.out.println(&quot;enter the choice&quot;);
int a = sc.nextInt();
switch(a) {
case 1:
System.out.println(&quot;enter the customer name&quot;);

c.setName(sc.next());
System.out.println(&quot;enter the customer address&quot;);
c.setAddress(sc.next());
System.out.println(&quot;enter the ticket number&quot;);
t.setTicno(sc.nextInt());
System.out.println(&quot;enter the ticket seat no&quot;);
t.setSeatno(sc.nextInt());
System.out.println(&quot;enter the ticket price&quot;);
t.setPrice(sc.nextInt());
System.out.println(&quot;enter the ticket Type -

economic/gold/platinum&quot;);

t.setTicktype(sc.next());
c.setTick(t);
System.out.println(&quot;thanks for input&quot;);
break;

case 2:
System.out.println(&quot;Customer Details:&quot;);
System.out.println(&quot;Name:&quot;+c.getName()+&quot; &quot;+&quot;
Address:&quot;+c.getAddress());
System.out.println(&quot;Ticket Details&quot;);
t = c.getTick();
System.out.println(&quot;Ticket No: &quot;+t.getTicno());
System.out.println(&quot;Ticket Type: &quot;+t.getTicktype());
System.out.println(&quot;Ticket Seat No: &quot;+t.getSeatno());
System.out.println(&quot;Ticket Price: &quot;+t.getPrice());
break;
case 3:
System.exit(0);
}
}
}
}
