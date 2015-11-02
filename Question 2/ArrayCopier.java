public class ArrayCopier {
	public int[] copy(int[] src, int[] dst){
		if (src.length > dst.length){
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		} else if (src.length < dst.length) {
			for (int i = 0; i < src.length; i++) {
				dst[i] = src[i];
			}
			for (int x = src.length; x < dst.length; x++){
				dst[x] = 0;
			}
		} else {
			dst = src;			
		}
		return dst;
	}
	public void prettyPrint(int[] x){
		String str = "";
		for (int i = 0; i < x.length; i++) {			
			str = str + x[i] + " ";
		}
		System.out.println(str);
	}
}
