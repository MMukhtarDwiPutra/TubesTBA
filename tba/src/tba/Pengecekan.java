package tba;

public class Pengecekan {
        char[] c1=null;
        char[] c2=null;
        char[] c3=null;
        char[] c4=null;
        boolean split=false;
    public void SplitKata(String Kalimat){
        String[] k= Kalimat.split(" ");
        boolean cSubyek=false;
        if (k.length==2) {
            c1=k[0].toCharArray();
            c2=k[1].toCharArray();
            split=true;
        } else if (k.length==3) {
            c1=k[0].toCharArray();
            c2=k[1].toCharArray();
            c3=k[2].toCharArray();
            split=true;
        } else if (k.length==4) {
            c1=k[0].toCharArray();
            c2=k[1].toCharArray();
            c3=k[2].toCharArray();
            c4=k[3].toCharArray();
            split=true;
        } else {
            split=false;
        }
    }
    public String checkKalimat(String kalimat) {
        boolean ck1=false;
        String t="ERROR";
        SplitKata(kalimat);
        if (split) {
            if (checkSubyek()) {
                t="S -";
                if (checkPredikat()) {
                    t+=" P ";
                    if (c3!=null) {
                        if (checkObjek()) {
                        t+="- O ";
                        if (checkKeterangan()) {
                            t+="- K";
                        }
                    } else if (checkKeterangan()) {
                        t+="- K";
                    }
                    }
                } else  {
                    t="ERROR";
                }
            }
        }
        return t;
    }
    public boolean checkSubyek() {
        if (c1[0]=='A') {
            if (c1[1]=='k') {
                if (c1[2]=='u') {
                    if (c1.length==3) {
                        return true;
                    }
                }
            }
        } else if (c1[0]=='K') {
            if (c1[1]=='a') {
                if (c1[2]=='m') {
                    if (c1[3]=='u' || c1[3]=='i') {
                        if (c1.length==4) {
                            return true;
                        }
                    }
                }
            }
        } else if (c1[0]=='P') {
            if (c1[1]=='u') {
                if (c1[2]=='t') {
                    if (c1[3]=='r') {
                        if (c1[4]=='a') {
                            if (c1.length==5) {
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (c1[0]=='G') {
            if (c1[1]=='e') {
                if (c1[2]=='r') {
                    if (c1[3]=='y') {
                        if (c1.length==4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean checkPredikat() {
        if (c2[0]=='m') {
            if (c2[1]=='e') {
                if (c2[2]=='m') {
                    if (c2[3]=='a') {
                        if (c2[4]=='n') {
                            if (c2[5]=='c') {
                                if (c2[6]=='i') {
                                    if (c2[7]=='n') {
                                        if (c2[8]=='g') {
                                            if (c2.length==9) { //memancing
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (c2[4]=='k') {
                            if (c2[5]=='a') {
                                if (c2[6]=='i') {
                                    if (c2.length==7) { //menakai
                                        return true;
                                    }
                                }
                            }
                        } 
                    } else if (c2[3]=='e') {
                        if (c2[4]=='c') {
                            if (c2[5]=='a') {
                                if (c2[6]=='h') {
                                    if (c2[7]=='k') {
                                        if (c2[8]=='a') {
                                            if (c2[9]=='n') {
                                                if (c2.length==10) { //memecahkan
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (c2[2]=='n') {
                    if (c2[3]=='y') {
                        if (c2[4]=='u') {
                            if (c2[5]=='k') {
                                if (c2[6]=='a') {
                                    if (c2[7]=='i') {
                                        if (c2.length==8) { //menyukai
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        } else if (c2[0]=='d') {
            if (c2[1]=='i') {
                if (c2[2]=='k') {
                    if (c2[3]=='e') {
                        if (c2[4]=='j') {
                            if (c2[5]=='a') {
                                if (c2[6]=='r') {
                                    if (c2.length==7) { //dikejar
                                        return true;
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean checkObjek() {
        if (c3[0]=='i') {
            if (c3[1]=='k') {
                if (c3[2]=='a') {
                    if(c3[3]=='n') {
                        if (c3.length==4) { //ikan
                            return true;
                        }
                    }
                }
            }
        } else if (c3[0]=='a') {
            if (c3[1]=='n') {
                if (c3[2]=='j') {
                    if (c3[3]=='i') {
                        if (c3[4]=='n') {
                            if (c3[5]=='g') { //anjing
                                return true;
                            }
                        }
                    }
                }
            }
        } else if (c3[0]=='k') {
            if (c3[1]=='u') {
                if (c3[2]=='c') {
                    if (c3[3]=='i') {
                        if (c3[4]=='n') {
                            if (c3[5]=='g') {
                                if (c3.length==6) { //kucing
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } else if (c3[0]=='p') {
            if (c3[1]=='i') {
                if (c3[2]=='r') {
                    if (c3[3]=='i') {
                        if (c3[4]=='n') {
                            if (c3[5]=='g') {
                                if (c3.length==6) { //pirirng
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } else if (c3[0]=='s') {
            if (c3[1]=='e') {
                if (c3[2]=='n') {
                    if (c3[3]=='d') {
                        if (c3[4]=='o') {
                            if (c3[5]=='k') {
                                if (c3.length==6) { //sendok
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }    
        
        return false;
    }
    
    public boolean checkKeterangan() {
        if (c4!=null) {
            if (c4[0]=='l') {
                if (c4[1]=='a') {
                    if (c4[2]=='u') {
                        if (c4[3]=='t') {
                            if (c4.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c4[0]=='d') {
                if (c4[1]=='a') {
                    if (c4[2]=='p') {
                        if (c4[3]=='u') {
                            if (c4[4]=='r') {
                                if (c4.length==5) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (c4[0]=='e') {
                if (c4[1]=='m') {
                    if (c4[2]=='a') {
                        if (c4[3]=='s') {
                            if (c4.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c4[0]=='l') {
                if (c4[1]=='i') {
                    if (c4[2]=='a') {
                        if (c4[3]=='r') {
                            if (c4.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c4[0]=='h') {
                if (c4[1]=='i') {
                    if (c4[2]=='t') {
                        if (c4[3]=='a') {
                            if (c4[4]=='m') {
                                if (c4.length==5) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        } else if (c4==null) {
            if (c3[0]=='l') {
                if (c3[1]=='a') {
                    if (c3[2]=='u') {
                        if (c3[3]=='t') {
                            if (c3.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c3[0]=='d') {
                if (c3[1]=='a') {
                    if (c3[2]=='p') {
                        if (c3[3]=='u') {
                            if (c3[4]=='r') {
                                if (c3.length==5) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (c3[0]=='e') {
                if (c3[1]=='m') {
                    if (c3[2]=='a') {
                        if (c3[3]=='s') {
                            if (c3.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c3[0]=='l') {
                if (c3[1]=='i') {
                    if (c3[2]=='a') {
                        if (c3[3]=='r') {
                            if (c3.length==4) {
                                return true;
                            }
                        }
                    }
                }
            } else if (c3[0]=='h') {
                if (c3[1]=='i') {
                    if (c3[2]=='t') {
                        if (c3[3]=='a') {
                            if (c3[4]=='m') {
                                if (c3.length==5) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }            
        }
        return false;
    }
}