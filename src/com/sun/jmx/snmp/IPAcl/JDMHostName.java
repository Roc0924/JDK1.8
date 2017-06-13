/*
 * Copyright (c) 1997, 2007, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


/* Generated By:JJTree: Do not edit this line. JDMHostName.java */

package com.sun.jmx.snmp.IPAcl;

import java.net.UnknownHostException;

class JDMHostName extends Host {

  private static final long serialVersionUID = -9120082068923591122L;

  protected StringBuffer name = new StringBuffer();

  JDMHostName(int id) {
    super(id);
  }

  JDMHostName(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
    return new JDMHostName(id);
  }

  public static Node jjtCreate(Parser p, int id) {
    return new JDMHostName(p, id);
  }

  protected String getHname() {
    return name.toString();
  }

  protected PrincipalImpl createAssociatedPrincipal()
      throws UnknownHostException {
    return new PrincipalImpl(name.toString());
  }
}
