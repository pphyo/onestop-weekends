package com.jdc.app.seal;

// sealed class
// non-sealed class
// final class

public sealed class SingleNode implements Node permits ChildSingleNode {

}
