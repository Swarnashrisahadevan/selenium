package og.Test6;

import org.junit.Test;


public class Testpro extends Baseclass{ 
	Fblogin f;
	@Test
	public void tc1() {
		// TODO Auto-generated method stub
       launchBrowser();
       launchUrl("https://en-gb.facebook.com/");
       f = new Fblogin();
       passText("selinium", f.getEmail());
       passText("122234436", f.getPassword());
       clickBtn(f.getLogin());
       
	}
       

	@Test
      public void tc3() {
		// TODO Auto-generated method stub
     launchBrowser();
	 launchUrl("https://en-gb.facebook.com/");
     f = new Fblogin();
     passText("selinium", f.getEmail());
     passText("122234436", f.getPassword());
     clickBtn(f.getLogin());
     
	}
     
}

