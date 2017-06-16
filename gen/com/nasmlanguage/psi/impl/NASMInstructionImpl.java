// This is a generated file. Not intended for manual editing.
package com.nasmlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.nasmlanguage.psi.NASMTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.nasmlanguage.psi.*;

public class NASMInstructionImpl extends ASTWrapperPsiElement implements NASMInstruction {

  public NASMInstructionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull NASMVisitor visitor) {
    visitor.visitInstruction(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof NASMVisitor) accept((NASMVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<NASMAddress> getAddressList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMAddress.class);
  }

  @Override
  @Nullable
  public NASMDirective getDirective() {
    return findChildByClass(NASMDirective.class);
  }

  @Override
  @NotNull
  public List<NASMMacroCall> getMacroCallList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, NASMMacroCall.class);
  }

  @Override
  @Nullable
  public PsiElement getComment() {
    return findChildByType(COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getFpuOp() {
    return findChildByType(FPU_OP);
  }

  @Override
  @Nullable
  public PsiElement getGeneralOp() {
    return findChildByType(GENERAL_OP);
  }

  @Override
  @Nullable
  public PsiElement getLabelDef() {
    return findChildByType(LABEL_DEF);
  }

  @Override
  @Nullable
  public PsiElement getMmxOp() {
    return findChildByType(MMX_OP);
  }

  @Override
  @Nullable
  public PsiElement getOpPrefix() {
    return findChildByType(OP_PREFIX);
  }

  @Override
  @Nullable
  public PsiElement getSse2Op() {
    return findChildByType(SSE2_OP);
  }

  @Override
  @Nullable
  public PsiElement getSse3Op() {
    return findChildByType(SSE3_OP);
  }

  @Override
  @Nullable
  public PsiElement getSse4Op() {
    return findChildByType(SSE4_OP);
  }

  @Override
  @Nullable
  public PsiElement getSseOp() {
    return findChildByType(SSE_OP);
  }

  @Override
  @Nullable
  public PsiElement getX64Op() {
    return findChildByType(X64_OP);
  }

}
