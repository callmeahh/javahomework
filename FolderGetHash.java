package helloworld;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;

public class FolderGetHash {
	public static byte[] SHA1Checksum(InputStream is) throws Exception {
		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance("SHA-1");
		int numRead = 0;
		do {
			numRead = is.read(buffer);
			if (numRead > 0) {
				complete.update(buffer, 0, numRead);
			}
		} while (numRead != -1);
		is.close();
		return complete.digest();
	}

	public static String sha1(String data) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] b = data.getBytes();
		md.update(b);
		byte[] b2 = md.digest();
		int len = b2.length;
		String str = "0123456789abcdef";
		char[] ch = str.toCharArray();
		char[] chs = new char[len * 2];
		for (int i = 0, k = 0; i < len; i++) {
			byte b3 = b2[i];
			chs[k++] = ch[b3 >>> 4 & 0xf];
			chs[k++] = ch[b3 & 0xf];
		}
		return new String(chs);
	}

	public static String folderHash(String path) throws Exception {
		File dir = new File(path);
		StringBuffer s = new StringBuffer();
		if (dir.isDirectory()) {
			File[] fs = dir.listFiles();
			Arrays.sort(fs);
			for (int i = 0; i < fs.length; i++) {
				if (fs[i].isFile()) {
					FileInputStream is = new FileInputStream(fs[i]);
					byte[] sha1 = SHA1Checksum(is);
					String result = "";
					for (int j = 0; j < sha1.length; j++) {
						result += Integer.toString(sha1[j] & 0xFF, 16);
					}
					s.append(fs[i].getName());
					s.append("\t");
					s.append(result);
					s.append("\n");
				} else if (fs[i].isDirectory()) {
					s.append(fs[i].getName());
					s.append("\t");
					s.append(folderHash(fs[i].getPath()));
					s.append("\n");
				}
			}
			return sha1(s.toString());
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(folderHash("testdir2"));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
