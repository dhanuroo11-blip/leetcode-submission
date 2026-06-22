class RideSharingSystem {
      Queue <Integer> r=new LinkedList<>();
      Queue <Integer> d=new LinkedList<>();
    public RideSharingSystem() {
         
    }
    
    public void addRider(int riderId) {
        r.add(riderId);
    }
    
    public void addDriver(int driverId) {
        d.add(driverId);
    }
    
    public int[] matchDriverWithRider() {
        if(r.isEmpty()||d.isEmpty()){
            return new int[]{-1,-1};
        }
        return new int[]{d.poll(),r.poll()};
    }
    
    public void cancelRider(int riderId) {
        r.remove(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */