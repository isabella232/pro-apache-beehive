package apress.beehive.controls.ejbcontrol;

import com.apress.beehive.bookstore.ejb.BookDetailHome;
import com.apress.beehive.bookstore.ejb.BookDetailRemote;
import org.apache.beehive.controls.api.bean.ControlExtension;
import org.controlhaus.ejb.SessionEJBControl;
import org.controlhaus.ejb.EJBControl.EJBHome;
import org.controlhaus.ejb.EJBControl.JNDIContextEnv;

@ControlExtension
    @EJBHome( jndiName="BookManager")
    @JNDIContextEnv(contextFactory="org.jnp.interfaces.NamingContextFactory",
        providerURL="jnp://localhost:1099" )
        public interface BookDetailEJBControl
        extends SessionEJBControl, BookDetailHome, BookDetailRemote {
}
