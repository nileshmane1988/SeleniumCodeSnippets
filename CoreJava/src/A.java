
public class A {

static int  c =1;
		static A Obj = new A();
		
		private A()
		{
			
		}

		public static A getA()
		{
			
		System.out.println(c++);
			return Obj;
			
		}
		
		void disp()
		{
			System.out.println("disp method");
		}
	}


