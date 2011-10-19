package edu.chalmers.aardvark.test.unit.ctrl;

import junit.framework.TestCase;
import edu.chalmers.aardvark.ctrl.SystemCtrl;

public class SystemCtrlTest {

	private SystemCtrl systemCtrl;

	public void setUp() throws Exception {
		systemCtrl = SystemCtrl.getInstance();
	}
	
	public void testGetsystemInstance(){
		assertTrue(SystemCtrl.getInstance() == systemCtrl);
	}

	public void testPerformSetup(){
			performSetup();
			assertTrue(isFirstRun() == false);
	}
	
	public void tearDown() throws Exception {
	}

}
