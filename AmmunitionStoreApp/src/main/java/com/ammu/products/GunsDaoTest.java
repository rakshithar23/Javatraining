package com.ammu.products;

public class GunsDaoTest {
	
    public void testSelect() {
    	GunsDao guns = GunsDao.getInstance();
        guns.select();
       
    }
}

