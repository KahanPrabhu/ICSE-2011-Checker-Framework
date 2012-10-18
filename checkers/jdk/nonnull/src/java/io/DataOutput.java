package java.io;

import checkers.nonnull.quals.Nullable;

@checkers.quals.DefaultQualifier(checkers.nonnull.quals.NonNull.class)

public abstract interface DataOutput {
  public abstract void write(int a1) throws IOException;
  public abstract void write(byte[] a1) throws IOException;
  public abstract void write(byte[] a1, int a2, int a3) throws IOException;
  public abstract void writeBoolean(boolean a1) throws IOException;
  public abstract void writeByte(int a1) throws IOException;
  public abstract void writeShort(int a1) throws IOException;
  public abstract void writeChar(int a1) throws IOException;
  public abstract void writeInt(int a1) throws IOException;
  public abstract void writeLong(long a1) throws IOException;
  public abstract void writeFloat(float a1) throws IOException;
  public abstract void writeDouble(double a1) throws IOException;
  public abstract void writeBytes(String a1) throws IOException;
  public abstract void writeChars(String a1) throws IOException;
  public abstract void writeUTF(String a1) throws IOException;
}