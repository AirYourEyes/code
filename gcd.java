	//欧几里得算法（求最大公约数）
	public static int gcd(int p, int q){
		if (q == 0){
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}
