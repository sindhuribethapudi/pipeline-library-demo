#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String teddy = "yes i'm teddy"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
