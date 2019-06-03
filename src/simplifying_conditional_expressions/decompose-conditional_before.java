if (date.isSummer()) {
    charge = quantity * summerRate;
}
else {
    charge = quantity * winterRate + winterServiceCharge;
}