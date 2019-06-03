void renderBanner() {
    final boolean platUpperMAC = platform.toUpperCase().indexOf("MAC") > -1;
    final boolean browUpperIE = browser.toUpperCase().indexOf("IE") > -1;
    final boolean resized = resize > 0;
  if (platUpperMAC && browUpperIE && wasInitialized() && resize > 0 )
  {
    // do something
  }
}