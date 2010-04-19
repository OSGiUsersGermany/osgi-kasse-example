package org.osgiusers.germany.example.kasse.webtest;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

public class Activator extends Plugin {

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		super.start(context);
		Bundle[] bundles = context.getBundles();
		for (int i = 0; i < bundles.length; i++) {
			Bundle bundle = bundles[i];
			try {
				if (bundle.getState() == Bundle.RESOLVED) {
					System.out.println("Starting "+ bundle.getBundleId());
					bundle.start();
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
