package org.omg.PortableServer.CurrentPackage;


/**
 * org/omg/PortableServer/CurrentPackage/NoContext.java . Generated by the IDL-to-Java compiler
 * (portable), version "3.2" from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u60/4407/corba/src/share/classes/org/omg/PortableServer/poa.idl
 * Tuesday, August 4, 2015 11:07:54 AM PDT
 */

public final class NoContext extends org.omg.CORBA.UserException {

  public NoContext() {
    super(NoContextHelper.id());
  } // ctor


  public NoContext(String $reason) {
    super(NoContextHelper.id() + "  " + $reason);
  } // ctor

} // class NoContext
