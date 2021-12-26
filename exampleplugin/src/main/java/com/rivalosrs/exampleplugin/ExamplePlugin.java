package com.rivalosrs.exampleplugin;

import javax.inject.Inject;

import javax.swing.SwingUtilities;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import org.pf4j.Extension;

@Extension
@PluginDescriptor(
	name = "An example plugin",
	enabledByDefault = true
)
@Slf4j
public class ExamplePlugin extends Plugin
{
	@Inject
	private Client client;

	@Override
	protected void startUp()
	{
		SwingUtilities.invokeLater(() -> {
			var ex = new HistogramEx();
			ex.setVisible(true);
		});
	}

	@Override
	protected void shutDown()
	{
	}

}
