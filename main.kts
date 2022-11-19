// Marvish Chandra

class Population:
    fun populationDensity(Pt,P0,N,I,M,E){
        Pt = P0 + (N + I) - (M + E)
    }
    fun exponentialGrowth(Nt,N0,r,t){
        Nt = N0 * exp(r * t)
    }
    fun logisticGrowth(dN,dt,r,N,K){
        dN/dt = r * N * ((K-N) / K)
    }


