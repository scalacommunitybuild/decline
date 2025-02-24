package com.monovore.decline

object PlatformApp {

  /**
   * Returns `Some(argument list)` when compiled with Scala.js and running under Node.js, and `None`
   * otherwise.
   */
  def ambientArgs: Option[Seq[String]] = None
}
