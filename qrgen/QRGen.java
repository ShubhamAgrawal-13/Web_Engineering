import java.io.*;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

class QRGen
{
	public static void main(String[] args) throws IOException
	{
		String info = "Shubham , Govinda";

		ByteArrayOutputStream out1 = QRCode.from(info).to(ImageType.PNG).stream();
		File f = new File("C:\\Users\\Admin\\Desktop\\DBImage\\qrgen\\my.png");
		FileOutputStream fos = new FileOutputStream(f);
		fos.write(out1.toByteArray());
		fos.flush();
		System.out.println("Hello World!");
	}
}
