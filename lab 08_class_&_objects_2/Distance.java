class Distance
{
    int KM,MT;
    
    void setDistance(int k,int m)
    {
        KM=k;
        MT=m;
    }
    
    Distance add(Distance D)
    {
        KM=KM+D.KM;
        MT=MT+D.MT;
        
        while(MT>=1000)
        {
            KM=KM+1;
            MT=MT-1000;
        }
        return D;
    }
    
    void show()
    {
        System.out.print("THE DISTANCE IS: "+KM+" km "+MT+" mtr");
        
    }
}

