package org.wonderly.swing.tabs;

import java.util.EventObject;

import javax.swing.JTabbedPane;

/**
<pre>
Copyright (c) 1997-2006, Gregg Wonderly
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above
      copyright notice, this list of conditions and the following
      disclaimer in the documentation and/or other materials provided
      with the distribution.
    * The name of the author may not be used to endorse or promote
      products derived from this software without specific prior
      written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
OF THE POSSIBILITY OF SUCH DAMAGE.
</pre>
 *  This class is used to pass tab close events to
 *  interested parties.
 *  @see TabCloseListener
 *  @see CloseableTabbedPane
 */
@SuppressWarnings("serial")
public class TabCloseEvent extends EventObject {
	/** The index of the closing tab */
	private int tab;

	/** Construct an event for the indicated tab number associated
	 *  with the indicated JTabbedPane
	 */
	public TabCloseEvent( JTabbedPane pane, int tab ) {
		super( pane );
		this.tab = tab;
	}

	/** Get the closed tab index
	 *  @return the tab that is closed
	 */
	public int getClosedTab() {
		return tab;
	}
}