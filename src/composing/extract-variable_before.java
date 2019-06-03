void renderBanner() {
    final boolean platUpper = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean browUpper = browser.toUpperCase().indexOf("IE") > -1;
  if (platUpper && browUpper && wasInitialized() && resize > 0 )
  {
    // do something
  }
}