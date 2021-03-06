
/** ----------------------------------------------------------------------------------------------------
* 
*	This code was automatically generated by the LeanFT Application Model code generator.
*
*	Changes to this file may cause incorrect behavior and will be lost 
*	when the code is regenerated.
*
*   ----------------------------------------------------------------------------------------------------
*/
package net.mf;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;

// This class is automatically generated by the LeanFT Application Model code generator - version 14.03
public class AOSModel extends AppModelBase {		private advantageShoppingPage advantageShoppingPage;
	
	public AOSModel(TestObject contextTestObject) throws GeneralLeanFtException
	{
		setName("AOSModel");
				advantageShoppingPage = new advantageShoppingPage(contextTestObject, this);
		rebuildDescriptions();
	}	

			public advantageShoppingPage advantageShoppingPage() { return advantageShoppingPage; }

		public class advantageShoppingPage extends PageNodeBase
	{

		
			private sPEAKERSLink sPEAKERSLink;
	private tABLETSLink tABLETSLink;
	private hEADPHONESLink hEADPHONESLink;
	private mICELink mICELink;
	private lAPTOPSLink lAPTOPSLink;
						public advantageShoppingPage(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

					sPEAKERSLink = new sPEAKERSLink(this, applicationModel);
		tABLETSLink = new tABLETSLink(this, applicationModel);
		hEADPHONESLink = new hEADPHONESLink(this, applicationModel);
		mICELink = new mICELink(this, applicationModel);
		lAPTOPSLink = new lAPTOPSLink(this, applicationModel);

			setDisplayName("Advantage Shopping");
		}

		@Override
		protected com.hp.lft.sdk.web.PageDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.PageDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.PageDescription();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				public sPEAKERSLink sPEAKERSLink() { return sPEAKERSLink; }
		public tABLETSLink tABLETSLink() { return tABLETSLink; }
		public hEADPHONESLink hEADPHONESLink() { return hEADPHONESLink; }
		public mICELink mICELink() { return mICELink; }
		public lAPTOPSLink lAPTOPSLink() { return lAPTOPSLink; }
		
			public class sPEAKERSLink extends LinkNodeBase
	{

		
								public sPEAKERSLink(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("SPEAKERS");
		}

		@Override
		protected com.hp.lft.sdk.web.LinkDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.LinkDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.LinkDescription.Builder().innerText("SPEAKERS").tagName("SPAN").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class tABLETSLink extends LinkNodeBase
	{

		
								public tABLETSLink(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("TABLETS");
		}

		@Override
		protected com.hp.lft.sdk.web.LinkDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.LinkDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.LinkDescription.Builder().innerText("TABLETS").tagName("SPAN").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class hEADPHONESLink extends LinkNodeBase
	{

		
								public hEADPHONESLink(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("HEADPHONES");
		}

		@Override
		protected com.hp.lft.sdk.web.LinkDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.LinkDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.LinkDescription.Builder().innerText("HEADPHONES").tagName("SPAN").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class mICELink extends LinkNodeBase
	{

		
								public mICELink(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("MICE");
		}

		@Override
		protected com.hp.lft.sdk.web.LinkDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.LinkDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.LinkDescription.Builder().innerText("MICE").tagName("SPAN").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	public class lAPTOPSLink extends LinkNodeBase
	{

		
								public lAPTOPSLink(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);

			
			setDisplayName("LAPTOPS");
		}

		@Override
		protected com.hp.lft.sdk.web.LinkDescription createDescription() throws GeneralLeanFtException{
			com.hp.lft.sdk.web.LinkDescription description = null; 
			try{
				description = new com.hp.lft.sdk.web.LinkDescription.Builder().innerText("LAPTOPS").tagName("SPAN").build();
			}catch(Exception e){
				throw new GeneralLeanFtException(e.getMessage(), e);
			}
			return description;
		}

				
			}

	}


			
	public abstract class PageNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.Page, com.hp.lft.sdk.web.PageDescription> implements com.hp.lft.sdk.web.Page
	{		
		public PageNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
		}

		


		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.CSSDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.XPathDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public boolean exists() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists();
		}

		@Override 
		public boolean exists(java.lang.Integer arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists(arg0);
		}

		@Override 
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public java.lang.String getText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getText();
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0, java.awt.Rectangle arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0, arg1);
		}

		@Override 
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public java.lang.String getURL() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getURL();
		}

		@Override 
		public java.lang.String getVisibleText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText();
		}

		@Override 
		public java.lang.String getVisibleText(java.awt.Rectangle arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText(arg0);
		}

		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public java.lang.String runJavaScript(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().runJavaScript(arg0);
		}

		@Override 
		public <TResult> TResult runJavaScript(java.lang.String arg0, java.lang.Class<TResult> arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().runJavaScript(arg0, arg1);
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
		}

		@Override 
		public void sync() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().sync();
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2, byte arg3) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2, arg3);
		}
	}
	
	public abstract class LinkNodeBase extends AppModelNodeBase<com.hp.lft.sdk.web.Link, com.hp.lft.sdk.web.LinkDescription> implements com.hp.lft.sdk.web.Link
	{		
		public LinkNodeBase(TestObject parent, AppModelBase applicationModel) throws GeneralLeanFtException
		{
			super(parent, applicationModel);
		}

		


		@Override 
		public void click() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click();
		}

		@Override 
		public void click(com.hp.lft.sdk.ClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public void click(com.hp.lft.sdk.MouseButton arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().click(arg0);
		}

		@Override 
		public <TChild extends TestObject> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.CSSDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public <TChild extends WebElement> TChild describe(java.lang.Class<TChild> arg0, com.hp.lft.sdk.web.XPathDescription arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().describe(arg0, arg1);
		}

		@Override 
		public void doubleClick() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick();
		}

		@Override 
		public void doubleClick(com.hp.lft.sdk.web.WebDoubleClickArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().doubleClick(arg0);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0);
		}

		@Override 
		public void dragAndDropOn(com.hp.lft.sdk.SupportDragAndDrop arg0, com.hp.lft.sdk.DragAndDropArgs arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().dragAndDropOn(arg0, arg1);
		}

		@Override 
		public boolean exists() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists();
		}

		@Override 
		public boolean exists(java.lang.Integer arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().exists(arg0);
		}

		@Override 
		public <TChild extends TestObject> TChild[] findChildren(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().findChildren(arg0, arg1);
		}

		@Override 
		public void fireEvent(com.hp.lft.sdk.web.EventInfo arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().fireEvent(arg0);
		}

		@Override 
		public java.awt.Point getAbsoluteLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAbsoluteLocation();
		}

		@Override 
		public java.lang.String getAccessibilityName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAccessibilityName();
		}

		@Override 
		public java.lang.String getAttribute(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttribute(arg0);
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getAttributes() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getAttributes();
		}

		@Override 
		public java.lang.String getBackgroundColor() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getBackgroundColor();
		}

		@Override 
		public java.lang.String getCSSSelector() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getCSSSelector();
		}

		@Override 
		public java.lang.String getClassName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getClassName();
		}

		@Override 
		public java.lang.String getColor() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getColor();
		}

		@Override 
		public java.lang.String getComputedStyle(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyle(arg0);
		}

		@Override 
		public java.util.Map<java.lang.String, java.lang.String> getComputedStyles() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getComputedStyles();
		}

		@Override 
		public java.lang.String getDisplayName()  
		{
			return getConcrete().getDisplayName();
		}

		@Override 
		public java.lang.String getFontName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getFontName();
		}

		@Override 
		public java.lang.String getHref() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getHref();
		}

		@Override 
		public java.lang.String getId() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getId();
		}

		@Override 
		public java.lang.String getInnerHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerHTML();
		}

		@Override 
		public java.lang.String getInnerText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getInnerText();
		}

		@Override 
		public java.awt.Point getLocation() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getLocation();
		}

		@Override 
		public java.lang.String getName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getName();
		}

		@Override 
		public com.hp.lft.sdk.NativeObject getNativeObject() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getNativeObject();
		}

		@Override 
		public java.lang.String getOuterHTML() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterHTML();
		}

		@Override 
		public java.lang.String getOuterText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getOuterText();
		}

		@Override 
		public java.lang.String getRole() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getRole();
		}

		@Override 
		public java.awt.Dimension getSize() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSize();
		}

		@Override 
		public java.awt.image.RenderedImage getSnapshot() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getSnapshot();
		}

		@Override 
		public java.lang.String getTagName() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTagName();
		}

		@Override 
		public java.lang.String getTarget() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTarget();
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0);
		}

		@Override 
		public java.awt.Rectangle[] getTextLocations(java.lang.String arg0, java.awt.Rectangle arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTextLocations(arg0, arg1);
		}

		@Override 
		public java.lang.String getTitle() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getTitle();
		}

		@Override 
		public java.lang.String getVisibleText() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText();
		}

		@Override 
		public java.lang.String getVisibleText(java.awt.Rectangle arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getVisibleText(arg0);
		}

		@Override 
		public java.lang.String getXPath() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().getXPath();
		}

		@Override 
		public void highlight() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().highlight();
		}

		@Override 
		public <TChild extends TestObject> int highlightMatches(java.lang.Class<TChild> arg0, com.hp.lft.sdk.Description arg1) throws com.hp.lft.sdk.GeneralLeanFtException, java.lang.CloneNotSupportedException 
		{
			return getConcrete().highlightMatches(arg0, arg1);
		}

		@Override 
		public void hoverTap() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap();
		}

		@Override 
		public void hoverTap(com.hp.lft.sdk.Location arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().hoverTap(arg0);
		}

		@Override 
		public boolean isVisible() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().isVisible();
		}

		@Override 
		public void longPress() throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress();
		}

		@Override 
		public void longPress(com.hp.lft.sdk.web.WebLongPressArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().longPress(arg0);
		}

		@Override 
		public void pan(com.hp.lft.sdk.web.WebPanArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0);
		}

		@Override 
		public void pan(long arg0, long arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pan(arg0, arg1);
		}

		@Override 
		public void pinch(com.hp.lft.sdk.web.WebPinchArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}

		@Override 
		public void pinch(double arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().pinch(arg0);
		}

		@Override 
		public void setDisplayName(java.lang.String arg0)  
		{
			getConcrete().setDisplayName(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.SwipeDirection arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public void swipe(com.hp.lft.sdk.web.WebSwipeArgs arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			getConcrete().swipe(arg0);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0);
		}

		@Override 
		public java.awt.Point verifyImageExists(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageExists(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, byte arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2);
		}

		@Override 
		public boolean verifyImageMatch(java.awt.image.RenderedImage arg0, com.hp.lft.sdk.ImageMaskArea arg1, byte arg2, byte arg3) throws com.hp.lft.sdk.GeneralLeanFtException 
		{
			return getConcrete().verifyImageMatch(arg0, arg1, arg2, arg3);
		}
	}
}
