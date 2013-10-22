package com.kkbox.toolkit.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPUtils {

	public static byte[] gzipCompress(byte[] input) {
		if (input == null || input.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		GZIPOutputStream gzip = null;
		try {
			gzip = new GZIPOutputStream(out);
			gzip.write(input);
			gzip.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (gzip != null) {
					gzip.close();
				}
			} catch (IOException e) {}
		}
		return out.toByteArray();
	}

	public static byte[] gzipDecompress(byte[] output) {
		if (output == null || output.length == 0) {
			return null;
		}
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayInputStream in = new ByteArrayInputStream(output);
		GZIPInputStream gunzip = null;
		try {
			gunzip = new GZIPInputStream(in);
			byte[] buffer = new byte[8192];
			int n;
			while ((n = gunzip.read(buffer)) >= 0) {
				out.write(buffer, 0, n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (gunzip != null) {
					gunzip.close();
				}
			} catch (IOException e) {}
		}
		return out.toByteArray();
	}
}
